package baekjoon.greedy.greedy_15904;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] UCPC = {'U','C','P','C'};
        int result = 0;
        for (int i = 0;i<str.length();i++){
            if(str.charAt(i)==UCPC[result]){
                result++;
            }
            if(result==4){
                break;
            }
        }
        if (result==4){
            System.out.println("I love UCPC");
        }else{
            System.out.println("I hate UCPC");
        }


    }
}
