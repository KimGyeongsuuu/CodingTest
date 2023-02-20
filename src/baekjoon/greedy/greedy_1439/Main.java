package baekjoon.greedy.greedy_1439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int sum = 0;
        int k = 0;

        for(int i=0;i<S.length()-1;i++){
            if((S.charAt(i)!=S.charAt(i+1))&&(k==0)){
                sum++;
                k=1;
            }else if(S.charAt(i)!=S.charAt(i+1)&&(k==1)){
                k=0;
            }
        }
        System.out.println(sum);

    }
}
