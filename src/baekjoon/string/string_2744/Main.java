package baekjoon.string.string_2744;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97){
                arr[i]= (char) (str.charAt(i)-32);
            }else{
                arr[i]= (char) (str.charAt(i)+32);
            }
        }
        for (char s : arr) {
            System.out.print(s);
        }
    }
}
