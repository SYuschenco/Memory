
public class MemoryHeap1 {
    public static void main(String[] args) {
        int i=0;
        Integer[] ref = new Integer[]{1,2};
        System.out.println("ref"+ref.toString());
        while (i<9){
            ref[0] = 1;
            //ref[1] = 3;
            //ref = ref[0];
            System.out.println("ref[0]="+ref[0]);
            //ArrayIndexOutOfBoundsException System.out.println("ref[1]"+ref[1].toString());
            System.out.println("ref[1]="+ref[1]);
            i++;
        }

        System.out.println("ref.length()="+ref.hashCode());
        System.out.println("ref.length()="+ref.clone());
        //System.out.println("out of while ref   "+ref.toString());
    }

}
