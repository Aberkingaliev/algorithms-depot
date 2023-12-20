package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseInteger {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        long result = 0;

        while (x != 0) {
            long digit = x%10;
            result+=digit;
            result = result*10;
            x = x/10;
        }

        result = result/10;

        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) {
            System.out.println(0);
            return;
        }

        if(x<0) {
            System.out.println((int) (-1 * result));
            return;
        };

        System.out.println((int) result);
    }

}
