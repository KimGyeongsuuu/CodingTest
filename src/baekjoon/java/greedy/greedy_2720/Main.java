package baekjoon.java.greedy.greedy_2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int[][] answer = new int[n][4];
        for(int i=0;i<n;i++){
            int price = Integer.parseInt(br.readLine());
            if(price>=quarter){
                answer[i][0]=price/quarter;
                price = price%quarter;
            }if(price>=dime){
                answer[i][1]=price/dime;
                price = price%dime;
            }if(price>=nickel){
                answer[i][2]=price/nickel;
                price = price%nickel;
            }if(price>=penny){
                answer[i][3]=price/penny;
                price = price%penny;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
}