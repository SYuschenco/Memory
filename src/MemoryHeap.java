
public class MemoryHeap {
    public static void main(String[] args) {
        //int i=0;
        Object[] ref = new Object[1];
        System.out.println("ref"+ref.toString());
        while (true){
            ref[0] = new Object[]{ref};
            //ref[1] = new Object[]{ref};
            ref = (Object[]) ref[0];
            System.out.println("ref[0]"+ref[0].toString());
            System.out.println("ref   "+ref.toString());
            //i++;
        }
        //System.out.println("out of while ref[0]"+ref[0].toString());
        //System.out.println("out of while ref   "+ref.toString());
    }

}
