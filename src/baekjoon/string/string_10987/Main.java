package baekjoon.string.string_10987;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='a')result++;
            if (str.charAt(i)=='e')result++;
            if (str.charAt(i)=='i')result++;
            if (str.charAt(i)=='o')result++;
            if (str.charAt(i)=='u')result++;
        }
        System.out.println(result);
    }
}
