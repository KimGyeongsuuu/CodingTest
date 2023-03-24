package baekjoon.java.greedy.greedy_1026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];
        int answer = 0;
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B, Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            answer+=A[i]*B[i];
        }
        System.out.println(answer);
    }
}
