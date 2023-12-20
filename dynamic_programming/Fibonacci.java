package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if(n<=1) {
            System.out.println(n);
            return;
        }

        int prev = 0;
        int next = 1;

        for (int i = 2; i <= n; i++) {
            next = prev+(prev=next);
        }

        System.out.println(next);
    }
}
