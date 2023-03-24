package baekjoon.datastructure.datastructure_10815;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n ,m;
    static int sanggen[];
    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine()); // 상근이가 입력할 숫자의 개수
        sanggen = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());


        for(int i=0;i<sanggen.length;i++){
            sanggen[i]= Integer.parseInt(st.nextToken()); // 상근이가 숫자를 입력
        }

        Arrays.sort(sanggen); // 상근이가 입력한 숫자를 정렬
        
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++){
            int num = Integer.parseInt(st.nextToken());
            if(binarySearch(num)){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }
        }
        br.close();
        bw.close();
    }
    public static boolean binarySearch(int num){
        int leftIdx = 0;
        int rightIdx = n-1;

        while(leftIdx <= rightIdx){
            int midIdx = (leftIdx + rightIdx)/2;
            int mid = sanggen[midIdx];
            if(num < mid){
                rightIdx=midIdx-1;
            } else if (num > mid) {
                leftIdx=midIdx+1;
            }else{
                return true;
            }
        }
        return false;
    }

}
