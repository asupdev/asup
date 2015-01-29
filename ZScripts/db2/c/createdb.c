#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sqlutil.h>
#include <sqlenv.h>
#include <sqlca.h>

#define USERID_SZ 128
#define PSWD_SZ 14

unsigned char sqle_819_037[256] = {
    0x00,0x01,0x02,0x03,0x37,0x2d,0x2e,0x2f,0x16,0x05,0x25,0x0b,0x0c,0x0d,0x0e,0x0f,
    0x10,0x11,0x12,0x13,0x3c,0x3d,0x32,0x26,0x18,0x19,0x3f,0x27,0x1c,0x1d,0x1e,0x1f,
    0x40,0x5a,0x7f,0x7b,0x5b,0x6c,0x50,0x7d,0x4d,0x5d,0x5c,0x4e,0x6b,0x60,0x4b,0x61,
    0xf0,0xf1,0xf2,0xf3,0xf4,0xf5,0xf6,0xf7,0xf8,0xf9,0x7a,0x5e,0x4c,0x7e,0x6e,0x6f,
    0x7c,0xc1,0xc2,0xc3,0xc4,0xc5,0xc6,0xc7,0xc8,0xc9,0xd1,0xd2,0xd3,0xd4,0xd5,0xd6,
    0xd7,0xd8,0xd9,0xe2,0xe3,0xe4,0xe5,0xe6,0xe7,0xe8,0xe9,0xba,0xe0,0xbb,0xb0,0x6d,
    0x79,0x81,0x82,0x83,0x84,0x85,0x86,0x87,0x88,0x89,0x91,0x92,0x93,0x94,0x95,0x96,
    0x97,0x98,0x99,0xa2,0xa3,0xa4,0xa5,0xa6,0xa7,0xa8,0xa9,0xc0,0x4f,0xd0,0xa1,0x07,
    0x20,0x21,0x22,0x23,0x24,0x15,0x06,0x17,0x28,0x29,0x2a,0x2b,0x2c,0x09,0x0a,0x1b,
    0x30,0x31,0x1a,0x33,0x34,0x35,0x36,0x08,0x38,0x39,0x3a,0x3b,0x04,0x14,0x3e,0xff,
    0x41,0xaa,0x4a,0xb1,0x9f,0xb2,0x6a,0xb5,0xbd,0xb4,0x9a,0x8a,0x5f,0xca,0xaf,0xbc,
    0x90,0x8f,0xea,0xfa,0xbe,0xa0,0xb6,0xb3,0x9d,0xda,0x9b,0x8b,0xb7,0xb8,0xb9,0xab,
    0x64,0x65,0x62,0x66,0x63,0x67,0x9e,0x68,0x74,0x71,0x72,0x73,0x78,0x75,0x76,0x77,
    0xac,0x69,0xed,0xee,0xeb,0xef,0xec,0xbf,0x80,0xfd,0xfe,0xfb,0xfc,0xad,0xae,0x59,
    0x44,0x45,0x42,0x46,0x43,0x47,0x9c,0x48,0x54,0x51,0x52,0x53,0x58,0x55,0x56,0x57,
    0x8c,0x49,0xcd,0xce,0xcb,0xcf,0xcc,0xe1,0x70,0xdd,0xde,0xdb,0xdc,0x8d,0x8e,0xdf
};

int checkError(struct sqlca *p, char *msg)
{
    char errorMsg[1024];
    int rc;

    if (p->sqlcode != 0 && p->sqlcode != 100)
    {
        if ((rc = sqlaintp(errorMsg, 1024, 80, p)) > 0)
        {
            printf("Error: %s %s\n", msg, errorMsg);
            return -1;
        }
    }
    return 0;
}

int main(int argc, char *argv[])
{
    struct sqlca sqlca;
    int rc = 0;
    char nodeName[SQL_INSTNAME_SZ + 1];
    char user[USERID_SZ + 1];
    char pswd[PSWD_SZ + 1];


    char dbName[SQL_DBNAME_SZ + 1];
    char dbLocalAlias[SQL_ALIAS_SZ + 1];
    char dbPath[SQL_PATH_SZ + 1];
    struct sqledbdesc dbDescriptor;
    SQLEDBTERRITORYINFO territoryInfo;


    if (argc == 3 || argc == 5)
    {
        strcpy(nodeName, argv[1]);
        strcpy(dbName, argv[2]);
        if (argc == 5)
        {
            strcpy(user, argv[3]);
            strcpy(pswd, argv[4]);
        } else
        {
            strcpy(user, "");
            strcpy(pswd, "");
        }
    } else
    {
        printf("USAGE: %s [nodeName dbName userid passwd]\n", argv[0]);
        exit(-1);
    }


    if (strlen(nodeName) > 0)
    {
        printf("Attaching to the instance: %s\n", nodeName);
        sqleatin(nodeName, user, pswd, &sqlca);
        if ((rc = checkError(&sqlca, "attaching to instance")) < 0)
        {
            return rc;
        }
    }

    strcpy(dbLocalAlias, dbName);
    strcpy(dbPath, "");

    strcpy(dbDescriptor.sqldbdid, SQLE_DBDESC_2);
    dbDescriptor.sqldbccp = 0;
    dbDescriptor.sqldbcss = SQL_CS_USER;
    memcpy(dbDescriptor.sqldbudc, sqle_819_037, SQL_CS_SZ);
    strcpy(dbDescriptor.sqldbcmt, "EBCDIC database collation sequence");
    dbDescriptor.sqldbsgp = 0;
    dbDescriptor.sqldbnsg = 10;
    dbDescriptor.sqltsext = -1;
    dbDescriptor.sqlcatts = NULL;
    dbDescriptor.sqlusrts = NULL;
    dbDescriptor.sqltmpts = NULL;

    strcpy(territoryInfo.sqldbcodeset, "ISO8859-1");
    strcpy(territoryInfo.sqldblocale, "IT");

    printf("Creating database %s\n", dbName);

    /* create database */
    sqlecrea(dbName, dbLocalAlias, dbPath, &dbDescriptor, &territoryInfo, '\0', NULL, &sqlca);
    if ((rc = checkError(&sqlca, "creating database")) < 0)
    {
        return rc;
    }

    if (strlen(nodeName) > 0)
    {
        printf("Detaching from instance: %s\n", nodeName);
        sqledtin(&sqlca);
        if ((rc = checkError(&sqlca, "detaching from instance")) < 0)
        {
            return rc;
        }
    }
    return 0;
}
