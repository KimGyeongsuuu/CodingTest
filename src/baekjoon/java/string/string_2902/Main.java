package baekjoon.java.string.string_2902;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        int k=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<names.length();i++){
            if(names.charAt(i)=='-'){
                k=0;
            }else{
                if(k==0)
                    sb.append(names.charAt(i));
                k++;
            }
        }
        System.out.println(sb);
    }
}
