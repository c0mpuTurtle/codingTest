package org.example.codingtest.week1;

import java.io.*;
import java.util.Arrays;

public class Q1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).
                toArray();

        int A = input[0];
        int B = input[1];
        int C = input[2];

        if (B >= C) bw.write("-1");
        else {
            int N = A / (C - B) + 1;
            bw.write(String.valueOf(N));
        }

        br.close();
        bw.close();
    }
}
