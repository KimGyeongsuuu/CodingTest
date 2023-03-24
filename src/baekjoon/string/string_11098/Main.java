package baekjoon.string.string_11098;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] result = new String[n];
        for(int i = 0;i<n;i++){
            Map<String,Integer> map = new HashMap<>();
            int m = sc.nextInt();
            for(int j=0;j<m;j++){
                Integer value = sc.nextInt();
                String key = sc.next();
                map.put(key,value);
            }
            Integer maxValue = Collections.max(map.values());
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                if (entry.getValue().equals(maxValue)) {
                    result[i] = entry.getKey();
                }
            }
        }
        for (String s : result) {
            System.out.println(s);
        }

    }
}
