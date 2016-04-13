import org.junit.*;

import static org.junit.Assert.assertEquals;


public class _10_Test {

    private static _10_ s;

    @BeforeClass
    public static void setUpClass() throws Exception {
        s = new _10_();
        System.out.println("\nsetUpClass method called!\n");
    }

    @Test(timeout = 3000)
    public void testAdd1() throws Exception {

        int a = 4;
        int b = 5;

        final int res = s.add(a, b);

        assertEquals(a + b, res);
    }

    //@Ignore
    @Test(timeout = 3000)
    public void testSub() throws Exception {

        int a = 4;
        int b = 5;

        final int res = s.sub(a, b);

        assertEquals(a - b, res);

    } @Test(timeout = 3000)
    public void testModulo() throws Exception {

        int a = 8;
        int b = 4;

        final int res = s.modulo(a, b);

        assertEquals(a % b, res);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDiv() throws Exception {

        int a = 8;
        int b = 4;

        s.div(a, b);

        //assertEquals(a % b, res);
    }
}
