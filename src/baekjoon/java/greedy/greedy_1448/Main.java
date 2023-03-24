package baekjoon.java.greedy.greedy_1448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.valueOf(br.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for(int i=0;i<n-2;i++){
            if(arr[i]<arr[i+1]+arr[i+2]){
                max = Math.max(max, arr[i]+arr[i+1]+arr[i+2]);
            }
        }
        if(max == 0){
            System.out.println(-1);
        }else{
            System.out.println(max);
        }
    }
}
