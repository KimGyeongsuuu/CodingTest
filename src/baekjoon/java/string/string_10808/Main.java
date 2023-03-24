package baekjoon.java.string.string_10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            arr[(int)str.charAt(i)-97]+=1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
