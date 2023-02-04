package baekjoon.datastructure_17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(bf.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            map.put(site,password);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            String site = bf.readLine();
            sb.append(map.get(site)+"\n");
        }
        System.out.println(sb);
    }
}
