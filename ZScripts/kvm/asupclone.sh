#! /bin/bash -x

if [ $# -lt 3 ]; then
    echo "Usage: $0 oldMachineName newMachineName newIP"
    exit 1
fi
oldMachineName=$1
newMachineName=$2
newIP=$3

virsh vol-delete $newMachineName.img --pool DiskPool
virsh pool-refresh DiskPool
virt-clone -o $oldMachineName -n $newMachineName -f /dev/DiskPool/$newMachineName.img

tmpIfcfgFile=/tmp/ifcfg-eth0
rm $tmpIfcfgFile

gfScript=/tmp/gfscript.txt

echo "run"                                                              >  $gfScript
echo "mount /dev/mapper/fedora-root /"                                  >> $gfScript
echo "copy-out /etc/sysconfig/network-scripts/ifcfg-eth0 /tmp"          >> $gfScript
echo "!perl -p -i -e \"s/^IPADDR=.*/IPADDR="$newIP"/\" /tmp/ifcfg-eth0" >> $gfScript
echo "!perl -p -i -e \"s/^HWADDR=.*/HWADDR=/\" /tmp/ifcfg-eth0"         >> $gfScript
echo "copy-in /tmp/ifcfg-eth0 /etc/sysconfig/network-scripts/"          >> $gfScript
echo "write /etc/hostname "$newMachineName""                            >> $gfScript

guestfish -d "$newMachineName" -f  $gfScript
rm $tmpIfcfgFile

echo 'Done'
