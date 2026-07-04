import java.io.*;

public class AAAA1P1Sort {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        String[] arr = br.readLine().trim().split("\\s+");

        int odd = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(arr[i]) % 2 != 0) {
                odd++;
            }
        }

        if (n % 2 != 0) {
            System.out.println("Steven");
        } else {
            if (odd > n / 2) {
                System.out.println("Todd");
            } else {
                System.out.println("Steven");
            }
        }
    }
}