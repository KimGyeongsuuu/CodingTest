package baekjoon.greedy.greedy_11047;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
               answer+=k/arr[i];
               k=k%arr[i];
            }
        }
        System.out.println(answer);
    }
}
