package baekjoon.greedy.greedy_1758;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            if(arr[i]-i<=0){
                break;
            }
            sum+=arr[i]-i;
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
