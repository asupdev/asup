package org.asup.git;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Title: VB Description: Funzioni VB-like Copyright: Copyright (c) 2003
 * Company: Molteni Informatica
 * 
 * @author Franco Lombardo
 * @version 1.0
 */

public class StringUtils {

	// Formattatore per il formato ggMMaa
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyy");
	private static SimpleDateFormat dateFormatMF =
			new SimpleDateFormat("yyyyMMdd");

	/**
	 * Costruttore privato: non consento istanziazioni
	 */
	private StringUtils() {
	}

	/**
	 * Versione Java della funzione Mid
	 */
	public static String mid(String s, int inizio, int lunghezza) {
		if (s == null) {
			return null;
		}

		if (inizio > s.length()) {
			return "";
		}

		int inizioLocale = inizio < 1 ? 1 : inizio;
		int lunghezzaLocale = lunghezza > s.length() ? s.length() : lunghezza;
		try {
			return s.substring(inizioLocale - 1, inizioLocale + lunghezzaLocale - 1);
		} catch (StringIndexOutOfBoundsException e) {
			return s.substring(inizioLocale - 1);
		}
	}

	public static String mid(String s, int inizio) {
		if (s == null) {
			return null;
		} else {
			return mid(s, inizio, Math.max(s.length() - inizio + 1, 0));
		}
	}

	public static String midFrom(String aString, String separatore) {
		int posizione = aString.indexOf(separatore);
		if (posizione == -1) {
			return null;
		}
		return mid(aString, posizione + separatore.length() + 1);
	}

	/**
	 */
	public static String left(String s, int nCaratteri) {

		if (s == null)
			return null;

		if (nCaratteri < 1)
			return "";

		if (nCaratteri >= s.length())
			return s;

		return s.substring(0, nCaratteri);
	}

	/**
	 */
	public static String right(String s, int nCaratteri) {
		if (s == null)
			return null;

		if (nCaratteri < 1)
			return "";

		if (nCaratteri >= s.length())
			return s;

		return s.substring(s.length() - nCaratteri);
	}


	/**
	 * Restiutisce la stringa s senza spazi iniziali e finali Se s e' null o
	 * stringa vuota, restituisce una stringa di un solo blank
	 */
	public static String trim1(String s) {
		return s == null || s.trim().equals("") ? " " : s.trim();
	}

	/**
	 * Elimina gli spazi a dx della stringa
	 */
	public static String rTrim(String s) {
		if (s == null) {
			return null;
		} else {
			char c[] = s.toCharArray();
			int i = s.length() - 1;
			while (i >= 0 && c[i] == ' ') {
				i--;
			}
			return s.substring(0, i + 1);
		}
	}

	/**
	 * Elimina gli spazi a sx della stringa
	 */
	public static String lTrim(String s) {
		if (s == null) {
			return null;
		} else {
			char c[] = s.toCharArray();
			int i = 0;
			while (i < s.length() && c[i] == ' ') {
				i++;
			}
			return s.substring(i, s.length());
		}
	}

	/**
	 * Restituisce un double ricavato dalla stringa <code>s</code> o zero se non
	 * riesce ad interpretarlo correttamente
	 */
	public static double val(String s) {
		double n;
		try {
			n = Double.parseDouble(s);
		} catch (Exception e) {
			n = 0;
		}
		return n;
	}

	/**
	 * Restuisce la stringa ottenuta da <code>numeroRipetizioni</code>
	 * ripetizioni di <code>stringa</code> o <code>""</code> se
	 * <code>stringa</code> e' <code>null</code> oppure se
	 * <code>numeroRipetizioni <= 0</code>
	 */
	public static String string(int numeroRipetizioni, String stringa) {
		if (stringa == null || numeroRipetizioni <= 0) {
			return "";
		} else {
			StringBuffer aus = new StringBuffer(numeroRipetizioni);
			for (int i = 1; i <= numeroRipetizioni; i++) {
				aus.append(stringa);
			}
			return aus.toString();
		}
	}

	/**
	 * Restuisce la stringa ottenuta da <code>numeroRipetizioni</code>
	 * ripetizioni di blanks. Restituisce <code>""</code> se
	 * <code>numeroRipetizioni <= 0</code>
	 */
	public static String space(int numeroRipetizioni) {
		if (numeroRipetizioni <= 0) {
			return "";
		} else {
			StringBuffer aus = new StringBuffer(numeroRipetizioni);
			for (int i = 1; i <= numeroRipetizioni; i++) {
				aus.append(" ");
			}
			return aus.toString();
		}
	}

	/**
	 * Restuisce la stringa ottenuta da <code>numeroRipetizioni</code>
	 * ripetizioni di <code>carattere</code> o <code>""</code> se
	 * <code>carattere</code> e' <code>null</code> oppure se
	 * <code>numeroRipetizioni <= 0</code>
	 */
	public static String string(int numeroRipetizioni, char carattere) {
		return string(numeroRipetizioni, new String(new char[] { carattere }));
	}

	public static String rSet(String sDaAllineare, int nCaratteri) {
		return rSet(sDaAllineare, nCaratteri, " ");
	}

	public static String rSetNum(Number num, int nCaratteri) {
		return rSet(nz(num), nCaratteri, "0"); 
	}

	/**
	 * Allinea a destra una stringa in una di nCaratteri
	 * 
	 * @param s
	 *          la stringa da allineare
	 * @param nCaratteri
	 *          lunghezza della stringa di output
	 * @return una stringa di nCaratteri riempita a sx da spazi (es. "pippo" -> "   pippo")
	 */
	public static String rSet(String sDaAllineare, int nCaratteri,
			String riempimento) {
		String filler = string(nCaratteri, riempimento);
		if (sDaAllineare == null || nCaratteri <= 0) {
			return filler;
		} else {
			return right(filler + sDaAllineare, nCaratteri);
		}
	}

	/**
	 * Allinea a sinistra una stringa in una di nCaratteri
	 * 
	 * @param s
	 *          la stringa da allineare
	 * @param nCaratteri
	 *          lunghezza della stringa di output
	 * @return una stringa di nCaratteri riempita a dx da spazi (es. "pippo" -> "pippo   ")
	 */
	public static String lSet(String sDaAllineare, int nCaratteri) {
		return lSet(sDaAllineare, nCaratteri, " ");
	}

	public static String lSet(String sDaAllineare, int nCaratteri,
			String riempimento) {
		String filler = string(nCaratteri, riempimento);
		if (sDaAllineare == null || nCaratteri <= 0) {
			return filler;
		} else {
			return left(sDaAllineare + filler, nCaratteri);
		}
	}

	public static String centra(String s, int nCaratteri) {
		return centra(s, nCaratteri, " ");
	}

	public static String centra(String s, int nCaratteri, String riempimento) {
		String filler = string(nCaratteri, riempimento);
		if (s == null || nCaratteri <= 0) {
			return filler;
		} else {
			int lunghezzaRiempimento = nCaratteri - s.length();
			if (lunghezzaRiempimento <= 0) {
				lunghezzaRiempimento = 0;
			} else {
				if (lunghezzaRiempimento % 2 == 1) {
					lunghezzaRiempimento++;
				}
				lunghezzaRiempimento /= 2;
			}
			return left(string(lunghezzaRiempimento, riempimento) + s
					+ string(lunghezzaRiempimento, riempimento), nCaratteri);
		}
	}

	/**
	 * Elimina gli zeri iniziali da una stringa
	 * 
	 * @return null se la stringa e' nulla, altrimenti la stringa, senza spazi
	 *         iniziali e finali e senza gli zeri iniziali
	 */
	public static String togliZeriIniziali(String codice) {
		if (codice == null) {
			return null;
		} else {
			return codice.trim().replaceFirst("0+", "");
		}
	}

	/**
	 * Quota i caratteri ' per poterli inserire in uno statement SQL
	 */
	public static String escape(String s) {
		String retvalue = s;
		if (s.indexOf("'") != -1) {
			StringBuffer hold = new StringBuffer();
			char c;
			for (int i = 0; i < s.length(); i++) {
				if ((c = s.charAt(i)) == '\'') {
					hold.append("''");
				} else {
					hold.append(c);
				}
			}
			retvalue = hold.toString();
		}
		return retvalue;
	}

	public static String nz(Object o) {
		return o == null ? "" : o.toString();
	}

	public static String rTrimObj(Object o) {
		return rTrim(nz(o));
	}

	public static String getStringOf(char character, int len) {
		String s = "";
		for (int i = 0; i < len; i++) {
			s += character;
		}
		return s;
	}

	public static String reverseCase(String str) {
		char[] buf = str.toCharArray();
		for (int i = 0; i < buf.length; i++) {
			if (Character.isLowerCase(buf[i])) {
				buf[i] = Character.toUpperCase(buf[i]);
			} else {
				buf[i] = Character.toLowerCase(buf[i]);
			}
		}
		return new String(buf);
	}

	public static String format(long numero, int numeroZeri) {
		return rSet(numero + "", numeroZeri, "0");
	}

	public static boolean isEmpty(String valore) {
		return (valore == null || valore.equals(""));
	}

	public static boolean isEmptyTrim(String valore) {
		return (valore == null || valore.trim().equals(""));
	}

	public static boolean isEmptyTrimNz(Object valore) {
		return "".equals(nz(valore).trim());
	}



	/**
	 * Sostituisce all'interno di una stringa una sottostringa con un'altra
	 * 
	 * @param str =
	 *          stringa da controllare
	 * @param pattern =
	 *          sottostringa da ricercare
	 * @param replace =
	 *          sottostringa da sostituire a quella trovata
	 * @return la stringa passata elaborata come richiesto
	 */
	public static String replace(String str, String pattern, String replace) {
		int s = 0;
		int e = 0;
		StringBuffer result = new StringBuffer();

		while ((e = str.indexOf(pattern, s)) >= 0) {
			result.append(str.substring(s, e));
			result.append(replace);
			s = e + pattern.length();
		}
		result.append(str.substring(s));
		return result.toString();
	}

	/**
	 * Sostituisce all'interno di una stringa una serie di caratteri, passati come
	 * stringa, con un'altra stringa
	 * 
	 * @param str =
	 *          stringa da controllare
	 * @param chars =
	 *          stringa di caratteri da ricercare
	 * @param replace =
	 *          sottostringa da sostituire ad ogni occorrenza di un carattere di
	 *          chars
	 * @return la stringa passata elaborata come richiesto
	 */
	public static String replaceChars(String str, String chars, String replace) {
		char[] charArray = chars.toCharArray();
		String _str = str;
		for (int i = 0; i < charArray.length; i++) {
			_str = replace(_str, "" + charArray[i], replace);
		}
		return _str;
	}

	/**
	 * Estrae dalla stringa la sottostringa dopo l'ultima occorrenza del carattere
	 * 
	 * @param s
	 *          la stringa origine
	 * @param carattere
	 *          il carattere dopo il quale estrarre la sottostringa
	 */
	public static String estraiDopo(String s, char carattere) {
		return s.substring(s.lastIndexOf(carattere) + 1);
	}

	public static String estraiDopo(String contenitore, String contenuto) {
		int lastIndexOf = contenitore.lastIndexOf(contenuto);
		if (lastIndexOf == -1) {
			return contenitore;
		} else {
			return contenitore.substring(lastIndexOf + contenuto.length());
		}
	}

	/**
	 * Estrae dalla stringa la sottostringa prima dell'ultima occorrenza del
	 * carattere
	 * 
	 * @param s
	 *          la stringa origine
	 * @param carattere
	 *          il carattere prima del quale estrarre la sottostringa
	 */
	public static String estraiPrima(String s, char carattere) {
		int indexOfChar = s.lastIndexOf(carattere);
		if (indexOfChar > -1) {
			return s.substring(0, indexOfChar);
		} else {
			return s;
		}
	}

	/**
	 * Se la stringa non � vuota mette uno spazio davanti altrimenti restituisce ""
	 */
	public static String padLeft(String s) {
		return (StringUtils.isEmptyTrim(s)) ? "" : " " + s;
	}

	public static String subst(String s, String vecchio, String nuovo) {
		return subst(s, vecchio, nuovo, false);
	}

	public static String subst(String s, String vecchio, String nuovo,
			boolean soloPrimaOccorrenza) {

		if (soloPrimaOccorrenza) {
			return replaceFirst(s, vecchio, nuovo);
		} else {
			//non va bene, rimpiazza uno qualsiasi dei char di "vecchio" con "nuovo"
			//return replaceChars(s, vecchio, nuovo);
			return replaceAllNoRegex(s, vecchio, nuovo);
		}
	}

	public static String replaceAllNoRegex(String s, String vecchio, String nuovo) {
		if (s == null) {
			return s;
		}
		int i = s.indexOf(vecchio);
		if (i < 0) {
			return s;
		}
		return s.substring(0, i) //head 
				+ nuovo 
				//tail
				+ replaceAllNoRegex(s.substring(i+vecchio.length(), s.length()), vecchio, nuovo);
	}
	public static String replaceAllNoRegexCaseInsensitive(String s, String vecchio, String nuovo) {
		if (s == null) {
			return s;
		}
		int i = indexOfCaseInsensitive(s, vecchio);
		if (i < 0) {
			return s;
		}
		return s.substring(0, i) //head 
				+ nuovo 
				//tail
				+ replaceAllNoRegexCaseInsensitive(s.substring(i+vecchio.length(), s.length()), vecchio, nuovo);
	}

	public static String replaceFirst(String s, String vecchio, String nuovo) {
		if (s == null) {
			return s;
		}
		//	  return s.replaceFirst(vecchio, nuovo);
		/**/
		if (vecchio != null && nuovo != null  && !vecchio.equals(nuovo)) {
			int posizione = s.indexOf(vecchio);
			if (posizione > -1) {
				return left(s, posizione) + nuovo + s.substring(posizione + vecchio.length());
			}
		}
		return s;
		/**/
	}

	/**
	 * Estrae una stringa che rappresenta l'hash code di una stringa data
	 * 
	 * @param string
	 *          la stringa origine
	 * @param length
	 *          la lunghezza della stringa hash
	 * @return hash code in formato stringa di lunghezza prefissata
	 */
	public static String hash(String string, int length) {
		return lSet(right(string.hashCode() + "", length), length);
	}



	/**
	 * Capovolge una stringa. Es. "ciao" diventa "aoic"
	 */
	public static String reverse(String source) {
		if (source == null || source.length() == 0) {
			return source;
		}
		int i, len = source.length();
		StringBuffer dest = new StringBuffer(len);
		for (i = (len - 1); i >= 0; i--)
			dest.append(source.charAt(i));
		return dest.toString();
	}

	public static BigDecimal midToBigDecimal(String s, int inizio, int lunghezza,
			int scala) {
		return toBigDecimal(mid(s, inizio, lunghezza), scala);
	}

	public static BigDecimal toBigDecimal(String s, int scale) {
		try {
			return new BigDecimal(new BigInteger(s.trim()), scale);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	public static Integer midToInteger(String s, int inizio, int lunghezza) {
		return toInteger(mid(s, inizio, lunghezza));
	}

	public static Long midToLong(String s, int inizio, int lunghezza) {
		return toLong(mid(s, inizio, lunghezza));
	}

	public static Integer toInteger(String s) {
		if (isEmptyTrim(s)) {
			return 0;
		}
		return Integer.valueOf((int) val(s.trim()));
	}

	public static Long toLong(String s) {
		if (isEmptyTrim(s)) {
			return 0L;
		}
		return new Long((long) val(s.trim()));
	}

	/**
	 * Scompone la stringa ricevuta come parametro in un array
	 * di stringhe lunghe n caratteri (len)
	 * @param s
	 * @param len
	 * @return
	 */
	public static String []split(String s,int len){
		return split(s,len,false);
	}

	/**
	 * Scompone la stringa ricevuta come parametro in un array
	 * di stringhe lunghe n caratteri (len), se escludiStringheVuote �
	 * true ignora le stringhe di n caratteri vuote
	 * @param s
	 * @param len
	 * @param escludiStringheVuote
	 * @return
	 */
	public static String []split(String s,int len,boolean escludiStringheVuote){
		String subString = "";
		ArrayList ar = new ArrayList();
		String[] ss;

		// scompatta la stringa
		for (int x= 0; x< s.length(); x= x + len){
			if (x + len <= s.length())
				subString = s.substring(x, x+len);
			else
				subString = s.substring(x);
			if (escludiStringheVuote) {
				if (! StringUtils.isEmptyTrim(subString)) {
					ar.add(subString);
				}
			} else {
				ar.add(subString);
			}
		}
		ss = new String[ar.size()];
		ss = (String[]) ar.toArray(new String[ar.size()]);
		return ss;
	}

	public static boolean contains(String container, String contained) {
		return container != null && container.indexOf(contained) > -1;
	}

	public static boolean containsCaseInsensitive(String container, String contained) {
		return indexOfCaseInsensitive(container, contained) > -1;
	}

	public static int indexOfCaseInsensitive(String container, String contained) {
		return nz(container).toUpperCase().indexOf(nz(contained).toUpperCase());
	}

	public static String firstLine(String aString) {
		try {
			BufferedReader reader = new BufferedReader(new StringReader(aString));
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}



	public static String zn(Object o) {
		if (o == null) { 
			return null;
		} 

		String oAsString = o.toString().trim();
		if (oAsString.equals("")) {
			return null;
		}

		return oAsString;
	} 

	/**
	 * Ritorna una stringa che � la sommatoria,
	 * separata da spazi, delle stringhe contenute nell'array.
	 * Elimina le stringhe vuote.
	 * Se l'array � nullo o vuoto ritorna blank;
	 * @param s
	 * @return
	 */
	public static String compatta(String[] s) {
		return compatta(s,true);
	}

	/**
	 * Ritorna una stringa che � la sommatoria,
	 * delle stringhe contenute nell'array.
	 * Elimina le stringhe vuote.
	 * Se l'array � nullo o vuoto ritorna blank.
	 * E' possibile indicare se le stringhe devono
	 * essere separate da spazi.
	 * @param s
	 * @param spazi
	 * @return
	 */
	public static String compatta(String[] s, boolean spazi) {
		String ss = "";
		if (s != null) {
			for (int i = 0; i < s.length; i++) {
				if (!StringUtils.isEmptyTrim(s[i])) {
					ss += (spazi ? " " : "") + s[i].trim();
				}
			}
		}
		return ss.trim();
	}

	/**
	 * Ritorna una stringa che � la sommatoria,
	 * delle stringhe contenute nell'array.
	 * Se l'array � nullo o vuoto ritorna blank.
	 * E' possibile indicare se le stringhe devono
	 * essere separate da spazi.
	 * Non elimina le stringhe vuote.
	 * @param s
	 * @param spazi
	 * @return
	 */
	public static String compattaSenzaTrim(String[] s, boolean spazi) {
		String ss = "";
		if (s != null) {
			for (int i = 0; i < s.length; i++) {
				ss += (spazi ? " " : "") + StringUtils.nz(s[i]);
			}
		}
		return ss;
	}

	public static String estensione(String path) {
		int k = path.lastIndexOf('.');
		String estensione;
		if (k < 0) {
			estensione = "";
		} else {
			try {
				estensione = new String(path.substring(k + 1));
			} catch (StringIndexOutOfBoundsException e1) {
				estensione = "";
			}
		}
		//
		return estensione;  
	}


	/**
	 * Restiutisce la stringa s senza spazi iniziali e finali
	 * Se s e' null o stringa vuota, restituisce una stringa di lunghezza 0
	 */
	public static String trim(String s) {
		return s == null || s.trim().equals("") ? "" : s.trim();
	}


	public static boolean areEquals(Object a, Object b) {
		if (a == null) {
			return b == null;
		}

		return a.equals(b);
	}

	public static boolean lenientEquals(String a, String b) {
		if (a == null || b == null) {
			return a == b;
		}

		return a.trim().equalsIgnoreCase(b.trim());
	}

	/**
	 * Sostituisce nella stringa foo l'ultima occorrenza della regex con replacement
	 * (es. replaceLast("abc12def34gh", "\\p{Digit}++", "@")=>"abc12def@gh")
	 */
	public static String replaceLast(String foo, String regex, String replacement) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(foo);
		int start = -1;
		int end = -1;
		//		String toReplace = null;
		while (m.find()) {
			start = m.start();
			end = m.end();
			//			toReplace = m.group();
		}
		if (start<0) {
			return foo;
		}
		return foo.substring(0, start) + replacement + foo.substring(end);  
		//		System.out.println(start);
		//		System.out.println(end);
		//		System.out.println(foo.substring(0, start));
		//		System.out.println(foo.substring(start, end));
		//		System.out.println(foo.substring(end));
		//		System.out.println(toReplace);
	}

	public static String[] splitWithOneBlank(String string) {
		if (isEmpty(string)) {
			return new String[]{};
		}

		return string.split(" {1}");
	}

	public static boolean isUpperCase(String originalFlagLetter) {
		if (originalFlagLetter == null) {
			return false;
		}
		return originalFlagLetter.toUpperCase().equals(originalFlagLetter);
	}

	public static Object coalesce(Object... objects) {
		for (int i = 0; i < objects.length; i++) {
			if(objects[i] != null) {
				return objects[i];
			}
		}
		return null;
	}

	public static String coalesceString(String... objects) {
		for (int i = 0; i < objects.length; i++) {
			if(!isEmptyTrim(objects[i])) {
				return objects[i].trim();
			}
		}
		return null;
	}

	public static String[] words(String s) {
		if (isEmptyTrim(s)) {
			return new String[0];
		}
		String[] words = s.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^\\w]", "");
		}
		return words;
	}

	/**
	 * 
	 * @param buffer stringa su cui scrivere
	 * @param value stringa da inseirire
	 * @param start
	 */
	public static String replaceInString(final String buffer, final String value, final int start) {
		if (buffer == null) {
			return buffer;
		}
		if (StringUtils.isEmptyTrim(value)) {
			return buffer;
		}
		String buff = StringUtils.nz(StringUtils.left(buffer, start-1)) 
				+ value 
				+ StringUtils.nz(StringUtils.right(buffer, buffer.length() - value.length() - start + 1));
		return buff;
	}

	private static String capitalize(String string) {
		if (isEmptyTrim(string)) {
			return string;
		}
		if (string.length() < 2) {
			return string.toUpperCase();
		}
		return Character.toUpperCase(string.charAt(0)) + string.substring(1).toLowerCase();
	}	  

	public static String overwrite(String s, int start, String newString) {
		if (StringUtils.isEmptyTrim(s)) {
			return newString;
		}
		if (start > s.length() + 1) {
			return lSet(s, start-1) + newString;
		}
		return new StringBuffer(s)
		.replace(start - 1, start -1 + newString.length(), newString)
		.toString();
	}

	/**
	 * @return es. "AB123CD" ritorna "CD"
	 */
	public static String getPostfissoAlfanumerico(String string) {
		String foo = StringUtils.nz(string).trim();
		Pattern p = Pattern.compile("\\p{Digit}"); //numeri
		Matcher m = p.matcher(foo);
		int start = -1;
		while (m.find()) {
			start = m.start();
		}
		if (start < 0  || (start == string.length()-1)) {
			return "";	  
		}
		return StringUtils.mid(foo, start+2);
	}

	public static String togliPostfissoAlfanumerico(String string) {
		String postfx = getPostfissoAlfanumerico(string);
		if (StringUtils.isEmptyTrim(postfx)) {
			return string;
		}
		return left(string, string.length() - postfx.length());
	}

}
