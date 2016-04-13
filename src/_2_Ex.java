
public class _2_Ex {


    public static void main(String[] args) {
        System.out.println("Begin program");
        String global = "Global Var";
        {
            String local = "Local Var";
            {

                System.out.println("Local Scope :");
                System.out.println("global=" + global);
                System.out.println("local=" + local);
            }
        }
        System.out.println("__________________");
        System.out.println("Global Scope :");
        System.out.println("global=" + global);
        //System.out.println("local=" + local); //ScopeExample3.java:18: error: cannot find symbol
        System.out.println();
        System.out.println("End program");
    }
}
