import java.util.Arrays;
import java.util.Scanner;


public class _3_Ex {

    public static void main(String[] args) {

        int[][] multiplyTab = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplyTab[i][j] = (i + 1) * (j + 1);
                //вывод ряда чисел разделенных знаком табуляции
                //System.out.print(multiplyTab[i][j] + "\t");
                System.out.printf("%4d", multiplyTab[i][j]);
            }
            System.out.println();
        }

        System.out.printf("%6d%n%6d%n%6d%n%6d%n%6d%n%6d\n", 666666, 55555, 4444, 333, 22, 1);
        System.out.printf("%1$+020.10f\n", Math.PI);
        System.out.printf("%1$-1.3f\n", Math.PI);
        System.out.print("123\b\b");
        System.out.println("123\b");
        System.out.print("\b\b123\n");
        String s1 = "ab";
        String s2 = "aa";
        System.out.println(s1.compareTo(s2));
        main1();
        Scanner scanner = new Scanner(System.in);
        String sp = scanner.nextLine();
        String[] sa = sp.split(",");
        int []iA = new int [sa.length];

        for (int i=0; i<iA.length;i++){
            iA[i]= Integer.valueOf(sa[i]);
        }
        for (int i : iA){
            System.out.print(" " + i);
        }

        String ss= ""+10;

        System.out.println("ss="+ss);

    }
    public static void main1() {
        String line = "Как использовать метод split";
        String[] words = line.split(" ");
        String[] twoWords = line.split(" ", 2);
        System.out.println("Используем разделитель: " + Arrays.toString(words));
        System.out.println("Разделяем на 2 строки: " + Arrays.toString(twoWords));
        //метод split со специальным разделителем
        String wordsSpecial = "Как|использовать|метод|split";
        String[] numbers = wordsSpecial.split("\\|");
        System.out.println("метод split со специальным разделителем: " + Arrays.toString(numbers));
    }

}

//Реализовать шифрование текста с помощью алгоритма Цезаря.

//    Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java