import java.math.BigInteger;

/**
 * Created by B4RT on 2017-06-06.
 */
public class Lotto {
    public static BigInteger factorial(int a)
     {
                BigInteger s = new BigInteger("1");
                for(int i=1; i<=a; i++)
                    {
                                s = s.multiply(BigInteger.valueOf(i));
                }
                return s;
            }

             public static void main(String[] args) {
                int n = 49;
                int k = 6;
                BigInteger result = factorial(n).divide(factorial(k).multiply(factorial(n-k)));
                 System.out.println("Probably to Lotto win is like 1 to "+result);

                    }
}
