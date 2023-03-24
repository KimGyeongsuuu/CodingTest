package baekjoon.java.string.string_2754;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.next();
        if(str.charAt(0)=='A'){
            if (str.charAt(1)=='+'){
                System.out.println(4.3);
            }else if (str.charAt(1)=='0'){
                System.out.println(4.0);
            }else if (str.charAt(1)=='-'){
                System.out.println(3.7);
            }
        }else if(str.charAt(0)=='B'){
            if (str.charAt(1)=='+'){
                System.out.println(3.3);
            }else if (str.charAt(1)=='0'){
                System.out.println(3.0);
            }else if (str.charAt(1)=='-'){
                System.out.println(2.7);
            }
        }else if(str.charAt(0)=='C'){
            if (str.charAt(1)=='+'){
                System.out.println(2.3);
            }else if (str.charAt(1)=='0'){
                System.out.println(2.0);
            }else if (str.charAt(1)=='-'){
                System.out.println(1.7);
            }
        }else if(str.charAt(0)=='D'){
            if (str.charAt(1)=='+'){
                System.out.println(1.3);
            }else if (str.charAt(1)=='0'){
                System.out.println(1.0);
            }else if (str.charAt(1)=='-'){
                System.out.println(0.7);
            }
        }else{
            System.out.println(0.0);
        }

    }
}
