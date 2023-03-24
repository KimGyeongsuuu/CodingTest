package baekjoon.java.string.string_2789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = {'C','A','M','B','R','I','D','G','E'};
        for(int i=0;i<arr.length;i++){
            if (str.indexOf(arr[i])>=0){
                str = str.replaceAll(String.valueOf(arr[i]),"");
            }
        }
        System.out.println(str);
    }
}

