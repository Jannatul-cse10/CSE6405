import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

public class JUnitTesting {

    @Test
    public void fact0is_1() throws Exception {
        assertEquals(BigInteger.valueOf(1), Factorial.factorial(0));
    }

    @Test
    public void fact1is_1() throws Exception {
        assertEquals(BigInteger.valueOf(1), Factorial.factorial(1));
    }

    @Test
    public void fact5is_120() throws Exception {
        assertEquals(BigInteger.valueOf(120), Factorial.factorial(5));
    }

    @Test
    public void fact7is_5040() throws Exception {
        assertEquals(BigInteger.valueOf(5040), Factorial.factorial(7));
    }

}
