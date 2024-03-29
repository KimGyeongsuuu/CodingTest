package baekjoon.greedy.greedy_11382;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        long answer = 0;
        for (String s1 : s) {
            answer+=Long.parseLong(s1);
        }
        System.out.println(answer);
    }
}
