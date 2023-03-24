package baekjoon.java.greedy.greedy_5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int change = 1000-price;
        int result = 0;
        if(change>=500){
            result += change/500;
            change = change%500;
        }if(change>=100){
            result += change/100;
            change = change%100;
        }if(change>=50){
            result += change/50;
            change = change%50;
        }if(change>=10){
            result += change/10;
            change = change%10;
        }if(change>=5){
            result += change/5;
            change = change%5;
        }if(change>=1){
            result += change/1;
            change = change%1;
        }
        System.out.println(result);
    }
}
