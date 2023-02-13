package baekjoon.greedy.greedy_1159;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        boolean possible = false;
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String name = br.readLine();
            char c = name.charAt(0);
            arr[c-97]++;
            if(arr[c-97]==5){
                possible = true;
            }
        }
        if(possible){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=5){
                    System.out.print((char)(i+'a'));
                }
            }
        }else{
            System.out.println("PREDAJA");
        }
    }
}
