package org.example.codingtest.week1;

import java.io.*;

public class Q23738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='B'){
                output+="v";
            }
            else if(input.charAt(i)=='E'){
                output+="ye";
            }
            else if(input.charAt(i)=='H'){
                output+="n";
            }
            else if(input.charAt(i)=='P'){
                output+="r";
            }
            else if(input.charAt(i)=='C'){
                output+="s";
            }
            else if(input.charAt(i)=='Y'){
                output+="u";
            }
            else if(input.charAt(i)=='X'){
                output+="h";
            }
            else {
                output+=Character.toLowerCase(input.charAt(i));
            }
        }
        bw.write(output);

        br.close();
        bw.close();
    }
}
