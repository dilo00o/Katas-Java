import java.util.ArrayList;
import java.util.List;

/***
 * odd/even/prime kata
 *
 */
public class OddEvenKata {
    private String odd = "Odd";
    private String even = "Even";
    private String prime = "Prime";

    public List<String> showOutputOf(int max) {
        List<String> result = new ArrayList<String>();
        result.add(odd);
        result.add(prime);
        for (int i = 3; i <= max; i++) {//2 is an even prime number
            if (i % 2 == 0)
                result.add(even);
            else if (isPrime(i))
                result.add(prime);
            else result.add(odd);
        }
        return result;
    }

    public boolean isPrime(int val) {
        for (int divisor = 2; val > divisor; divisor++)
            if (val % divisor == 0)
                return false;
        return true;
    }

}
