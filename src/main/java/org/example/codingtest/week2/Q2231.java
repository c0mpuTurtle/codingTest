package org.example.codingtest.week2;

import java.io.*;

public class Q2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < n; i++) {
            int sum = i;
            int tmp = i;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (sum == n) {
                result = i;
                break;
            }

        }
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
