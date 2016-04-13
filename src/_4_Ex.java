import java.util.Arrays;
import java.util.Scanner;
public class _4_Ex {

    public static void main(String[] args) {

     //в метод (де)кодирования я передаю начальный и конечный символы желаемой таблицы кодировки,
     //сдвиг(ключ) и строку для обработки

//        int shift = 1;
//        final int ALFABET_POWER = 26;
//        char startSymbolInAlfabet = 'a';
//        char endSymbolInAlfabet = 'z';

        System.out.println("Origin line");
        String line = "/dnt[ ]fwaqdfAWFafaWFawFAwfaWFAQWDSGTRJYjdfgsgttewr";
        System.out.println(line);
        String encode=encode(1, ' ', '~', line);
        String decode = decode(1, ' ', '~', encode);
        System.out.println("Decode=" + decode.equals(line));
    }

    //Encode
    static String encode(int shift, char startSymbolInAlfabet, char endSymbolInAlfabet, String line) {

        int shift1 = shift;
        char startSymbolInAlfabet1 = startSymbolInAlfabet;
        char endSymbolInAlfabet1 = endSymbolInAlfabet;
        int startSymbolInAlfabetCode = (int) startSymbolInAlfabet;
        int endSymbolInAlfabetCode = (int) endSymbolInAlfabet;
        String line1 = line;
        StringBuilder abc = new StringBuilder();
        for (int i = startSymbolInAlfabetCode; i <= endSymbolInAlfabetCode; i++) {
            abc.append((char) i);
        }
        String alfabet = "" + abc;
        System.out.println(alfabet);

        char[] chars = line1.toCharArray();
        char[] charsAlfabet = alfabet.toCharArray();
        System.out.println("Encode with shift " + shift1);
        char[] encode = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int n = ((int) chars[i] + shift1);
            char shiftSymbol = (char) n;
            if (n > endSymbolInAlfabetCode) {
                int n1 = n - endSymbolInAlfabetCode;
                int n2 = startSymbolInAlfabetCode - 1 + n1;
                shiftSymbol = (char) n2;
                //System.out.println("n="+n+"n1="+n1+"n2="+n2+"shiftSymbol="+shiftSymbol);
            }
            int shiftSymbolIndexInABC = alfabet.lastIndexOf(shiftSymbol);
            encode[i] = (charsAlfabet[shiftSymbolIndexInABC]);
        }
        System.out.println();
        System.out.println("Encode line");
        String lineEncode = new String(encode);
        System.out.println(lineEncode);
        return lineEncode;
    }

        //Decode
    static String decode(int shift, char startSymbolInAlfabet, char endSymbolInAlfabet, String lineEncode) {

        int shift1 = shift;
        char startSymbolInAlfabet1 = startSymbolInAlfabet;
        char endSymbolInAlfabet1 = endSymbolInAlfabet;
        int startSymbolInAlfabetCode = (int) startSymbolInAlfabet;
        int endSymbolInAlfabetCode = (int) endSymbolInAlfabet;
        String line1 = lineEncode;
        StringBuilder abc = new StringBuilder();
        for (int i = startSymbolInAlfabetCode; i <= endSymbolInAlfabetCode; i++) {
            abc.append((char) i);
        }
        String alfabet = "" + abc;
        System.out.println(alfabet);
        char[] charsAlfabet = alfabet.toCharArray();
        char[] encodeIn = line1.toCharArray();
        char[] decode = new char[encodeIn.length];
        for (int i = 0; i < encodeIn.length; i++) {
            int n = ((int) encodeIn[i] - shift1);
            char shiftSymbol = (char) n;
            if (n < startSymbolInAlfabetCode) {
                int n1 = n - startSymbolInAlfabetCode;
                int n2 = endSymbolInAlfabetCode + 1 + n1;
                shiftSymbol = (char) n2;
            }
            int shiftSymbolIndexInABC = alfabet.lastIndexOf(shiftSymbol);
            decode[i] = (charsAlfabet[shiftSymbolIndexInABC]);
        }
        System.out.println("Decode");
        String lineDecode = new String(decode);
        System.out.println(lineDecode);

        return lineDecode;

    }
}

//Реализовать шифрование текста с помощью алгоритма Цезаря.
//Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java