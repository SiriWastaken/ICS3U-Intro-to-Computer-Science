import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CCCJQRP3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        BigInteger sum = BigInteger.ZERO;
        
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.trim().split("\\s+");
            for (String token : tokens) {
                if (!token.isEmpty()) {
                    sum = sum.add(new BigInteger(token));
                }
            }
        }
        
        System.out.println(sum);
    }
}