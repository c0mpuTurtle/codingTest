package org.example.codingtest.week1;

import java.io.*;
import java.util.Arrays;

public class Q27159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).
                toArray();

        int sum = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i - 1] + 1 != arr[i]) {
                sum += arr[i];
            }
        }
        bw.write(sum + "\n");

        br.close();
        bw.close();
    }
    //아직 못 품
}
