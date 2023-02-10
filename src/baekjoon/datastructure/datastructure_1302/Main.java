package baekjoon.datastructure.datastructure_1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Map<String,Integer> titles = new HashMap();
        int max = 0;
        for(int i=0;i<n;i++){
            String title = bf.readLine();
            titles.put(title, titles.getOrDefault(title,0)+1 );
            max = Math.max(max,titles.get(title));
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : titles.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}
