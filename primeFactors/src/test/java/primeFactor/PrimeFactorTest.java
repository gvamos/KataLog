package primeFactor;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PrimeFactorTest {

    PrimeFactor p;

    @Before
    public void initObjects() {
        p = new PrimeFactor();
    }

    @Test
    public void testAdd(){
        Integer sum = p.plus(2,3);
        assert(sum == 5);
    }

    @Test
    public void testFactors1(){
      List<Integer> primes = p.factors(1);
      assertEquals("One should have only 1 prime factor",1,primes.size());
      Integer i = primes.get(0);
      assertEquals("One is its own prime factor",new Integer(1),i);
    }
}
