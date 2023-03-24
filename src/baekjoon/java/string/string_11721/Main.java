package baekjoon.java.string.string_11721;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        int k = 0;
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            k++;
            if(k==10){
                sb.append("\n");
                k=0;
            }
        }
        System.out.println(sb);

    }
}
