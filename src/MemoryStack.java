
public class MemoryStack {
    static int counter0 = 0;
    static int counter9 = 0;


    public static void main(String[] args) {
        //long [] arr = new long[Integer.MAX_VALUE];

        System.out.println("frame test0() int number 24779*4byt= "+24779*4/1024+"kbyte"+
                "\nframe test9() 9 long by 8byte * 14847="+9*8*14847/1024+"kbyte");
        System.out.println("Stack size="+(24779*4/1024+9*8*14847/1024)/1024+"Mb");

        try {
            test0();
            System.out.println(counter9);
        }catch (StackOverflowError ignore){}
        System.out.println(counter0);
        try {
            test9();
        }catch (StackOverflowError ignore){}
        System.out.println(counter9);
    }

    private static void test0(){
        counter0++;
        test0();
    }

    private static void test9(){
        long a1=0;
        long a2=0;
        long a3=0;
        long a4=0;
        long a5=0;
        long a6=0;
        long a7=0;
        long a8=0;
        long a9=0;
        counter9++;
        test9();
    }



}
