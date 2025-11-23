package org.example.codingtest.week5;

import java.io.*;

public class Q13301 {
    public static long fibonacci(int n) {
        if (n == 1 || n == 2) return 1;

        long[] arr = new long[n + 1];
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static long calculateLength(int n) {
        long width, height;
        if (n == 1) {
            width = fibonacci(n);
            height = fibonacci(n);
        } else if (n == 2) {
            width = fibonacci(n);
            height = 2 * fibonacci(n - 1);
        } else {
            width = fibonacci(n) + fibonacci(n - 1);
            height = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return 2 * (width + height);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(calculateLength(n)));

        br.close();
        bw.close();
    }
}
