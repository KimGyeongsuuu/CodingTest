package baekjoon.string.string_2083;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> grade = new ArrayList<>();
        int k = 0;
        while(true){
            String name = sc.next();
            int age = sc.nextInt();
            int height = sc.nextInt();
            if(name.equals("#")){
                break;
            }
            if(age>17 || height>=80 ){
                grade.add("Senior");
            }else{
                grade.add("Junior");
            }
            names.add(name);
        }
        for(int i=0;i<names.size();i++){
            System.out.print(names.get(i)+" ");
            System.out.println(grade.get(i));
        }

    }
}
