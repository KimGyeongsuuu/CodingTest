package baekjoon.string.string_1157;

import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[26];
        String str = sc.next();
        str = str.toUpperCase();
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'A']++;
        }
        int max = 0;
        int answer=0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                answer = i;
            }
            else if(max == arr[i]){
                answer = -2;
            }
        }

        System.out.printf("%s", Character.toString(answer+'A'));
    }
}
