package baekjoon.string.string_10953;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            String answer = sc.next();
            arr[i]=(answer.charAt(0)-'0')+(answer.charAt(2)-'0');
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
