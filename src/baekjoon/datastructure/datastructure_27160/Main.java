package baekjoon.datastructure.datastructure_27160;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "NO";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            String fruit = sc.next();
            int num = sc.nextInt();
            map.put(fruit, map.getOrDefault(fruit,0)+num);
        }
        for (String key : map.keySet()){
            if(map.get(key)==5){
                answer = "YES";
            }
        }
        System.out.println(answer);
    }
}