package baekjoon.string.string_8958;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int plus = 1;
        int sum = 0;
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            String str = sc.next();
            char[] arr = new char[str.length()];
            for(int j=0;j<str.length();j++){
                arr[j]=str.charAt(j);
                if(arr[j]=='O'){
                    sum+=plus++;
                }else{
                    plus=1;
                }
            }
            answer[i]=sum;
            sum=0;
            plus=1;
        }
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
