package baekjoon.greedy.greedy_14720;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0;
        int result = 0;
        for(int i=0;i<n;i++){
            int store = sc.nextInt();
            if(store == k){
                if(k==2){
                    k=0;
                }else{
                    k++;
                }
                result++;
            }
        }
        System.out.println(result);
    }
}
