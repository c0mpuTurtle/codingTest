package org.example.codingtest.week1;

import java.io.*;

public class Q5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String input = br.readLine();
            String[] arr = input.split(" ");

            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int C = Integer.parseInt(arr[2]);

            if(A==0 && B==0 && C==0){
                break;
            }
            else if(A+B<=C || B+C<=A || C+A<=B){
                bw.write("Invalid\n");
            }
            else if(A==B && B==C){
                bw.write("Equilateral\n");
            }
            else if(A==B || B==C || C==A){
                bw.write("Isosceles\n");
            }
            else{
                bw.write("Scalene\n");
            }
        }

        br.close();
        bw.close();
    }
}
