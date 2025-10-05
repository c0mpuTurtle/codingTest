package org.example.codingtest.week1;

import java.io.*;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] f = br.readLine().split(" ");
            int sum = Integer.parseInt(f[0]) + Integer.parseInt(f[1]);
            bw.write(sum + "\n");
        }

        br.close();
        bw.close();
    }
}
