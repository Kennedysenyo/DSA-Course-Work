package james_cutajar.chapt1;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Long> primeFactors(long x) {
        List<Long> result = new ArrayList<>();
        long factor = 2;
        while (x > 2) {
            if(x % factor == 0) {
                result.add(factor);
                x /= factor;
            }else {
                factor += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();

        long x = 2100078578;
        long y = 2100078577;

        System.out.println(primeFactors.primeFactors(y));
    }
}
