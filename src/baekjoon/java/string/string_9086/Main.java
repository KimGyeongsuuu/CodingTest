package baekjoon.java.string.string_9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();
            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length()-1));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
