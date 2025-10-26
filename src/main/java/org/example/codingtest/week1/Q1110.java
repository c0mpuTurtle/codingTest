package org.example.codingtest.week1;

import java.io.*;

public class Q1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int output = input;

        int cycle = 0;

        do {
            int A = output / 10;
            int B = output % 10;
            output = B * 10 + (A + B) % 10;
            cycle++;
        } while (input != output);

        bw.write(String.valueOf(cycle));

        br.close();
        bw.close();
    }
}
