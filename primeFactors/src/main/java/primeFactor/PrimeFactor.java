package primeFactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    Integer plus(Integer x, Integer y){
        return x + y;
    }

    List<Integer> factors(Integer i){
      List<Integer>primes = new ArrayList<Integer>();
      primes.add(1);
      return primes;
    }

    public static void main(){
        System.out.println("Prime Factor Thingie");
    }

}
