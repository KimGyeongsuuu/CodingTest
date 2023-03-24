package baekjoon.java.greedy.greedy_2847;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 1; i--) {
            while (arr[i] <= arr[i - 1]) {
                arr[i - 1] = arr[i - 1] - 1;
                sum++;
            }
        }
        System.out.println(sum);
    }
}
