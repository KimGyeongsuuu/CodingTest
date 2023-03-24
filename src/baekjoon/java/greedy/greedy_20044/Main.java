package baekjoon.java.greedy.greedy_20044;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n*2];
        int[] answer = new int[n];
        for(int i=0;i<n*2;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
           answer[i] = arr[i]+arr[n*2-i-1];
        }
        Arrays.sort(answer);
        System.out.println(answer[0]);

    }
}
