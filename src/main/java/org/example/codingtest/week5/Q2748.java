package org.example.codingtest.week5;

import java.io.*;

public class Q2748 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[n - 1] + arr[n - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(fibonacci(n)));

        bw.close();
        br.close();
    }
}
