package org.example.codingtest.week1;

import java.io.*;
import java.util.Arrays;

public class Q1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < 3; i++) {
            System.out.println(input[i]);
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
