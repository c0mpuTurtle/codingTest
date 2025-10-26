package org.example.codingtest.week1;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Q10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] init = Arrays.stream(br.readLine().split(" ")).
                mapToInt(Integer::parseInt)
                .toArray();

        int length = init[0];
        int count = init[1];

        int[] arr = IntStream.range(1, length + 1).toArray();
        for (int i = 0; i < count; i++) {
            int[] range = Arrays.stream(br.readLine().split(" ")).
                    mapToInt(Integer::parseInt)
                    .toArray();

            int from = range[0] - 1;
            int to = range[1] - 1;
            reverse(arr, from, to);
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        br.close();
        bw.close();
    }

    public static int[] reverse(int arr[], int from, int to) {
        for (int i = 0; i <= (to - from) / 2; i++) {
            int tmp = arr[from + i];
            arr[from + i] = arr[to - i];
            arr[to - i] = tmp;
        }

        return arr;
    }
}
