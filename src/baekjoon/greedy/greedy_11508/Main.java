package baekjoon.greedy.greedy_11508;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int k = 0;
        int result = 0;
        if(m%3>0)m=m/3+1;
        else m=m/3;
        int[][] arr = new int[m][3];
        Integer[] input = new Integer[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        Arrays.sort(input, Comparator.reverseOrder());
        for(int i=0;i<m;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=input[k];
                k++;
                if(k==n){
                    break;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                result+=arr[i][j];
            }
        }
        System.out.println(result);
    }
}
