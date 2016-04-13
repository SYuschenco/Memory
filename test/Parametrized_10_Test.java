import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class Parametrized_10_Test {

    private int nA;
    private int nB;
    private int expected;

    public Parametrized_10_Test(int nA, int nB, int expected) {
        this.nA = nA;
        this.nB = nB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: mult({0}*{1})={2})")
    //
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {2, 2, 4},
                {8, 2, 16},
                {4, 5, 20}
        });
    }
    @Test
    public void testMult(){
        Assert.assertEquals(expected, new _10_().mult(nA,nB));
    }

}
