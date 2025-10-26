package org.example.codingtest.week2;

import java.io.*;

public class Q24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        long c = (n * (n - 1) * (n - 2)) / 6;

        bw.write(c + "\n");
        bw.write("3");

        br.close();
        bw.close();
    }
}
