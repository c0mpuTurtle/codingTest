package org.example.codingtest.week1;

import java.io.*;

public class Q20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String[] arr = input.split("/");
        int K = Integer.parseInt(arr[0]);
        int D = Integer.parseInt(arr[1]);
        int A = Integer.parseInt(arr[2]);

        if (K + A < D || D == 0) {
            bw.write("hasu");
        } else {
            bw.write("gosu");
        }

        br.close();
        bw.close();
    }
}
