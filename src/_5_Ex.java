//import java.util.Scanner;
//
//public class _5_Ex {
//
//    public static void main(String[] args) {
//
//        String CapitalLetter = "АБВГДЕЁЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
//        String SmallLetter = "абвгдеёжзиклмнопрстуфхцчшщъыьэя";
//        Scanner InputStringIn = new Scanner(System.in);
//        String InputString = InputStringIn.nextLine();
//        Scanner CipherKeyIn = new Scanner(System.in);
//        int CipherKey = CipherKeyIn.nextInt();
//        for (int i = 0; i < InputString.length(); i++) {
//            char m = InputString.charAt(i);
//            if (m == CapitalLetter.charAt(i)) {
//                System.out.println(25);
//                int index = ((CapitalLetter.indexOf(g) + CipherKey) % 33);
//                g = index;
//                m = CapitalLetter.charAt(g);
//            }
//            if (m == SmallLetter.charAt(i)) {
//                System.out.println(35);
//                int index = ((SmallLetter.indexOf(i) + CipherKey) % 33);
//                g = index;
//                m = SmallLetter.charAt(g);
//            }
//            System.out.print(m);
//        }
//        System.out.println();
//        System.out.println(InputString);
//        System.out.println(CipherKey);
//    }
//}
//
////Реализовать шифрование текста с помощью алгоритма Цезаря.
//
////    Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java