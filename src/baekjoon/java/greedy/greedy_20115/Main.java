package baekjoon.java.greedy.greedy_20115;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,Comparator.reverseOrder());
        for(int i=1;i<n;i++){
            sum+=arr[i]/2.0;
        }
        System.out.println(sum+arr[0]);
    }
}
