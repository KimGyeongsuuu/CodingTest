package baekjoon.greedy.greedy_11399;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int answer = 0;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (Integer integer : arr) {
            sum = sum + integer;
            answer+=sum;
        }
        System.out.println(answer);
    }
}
