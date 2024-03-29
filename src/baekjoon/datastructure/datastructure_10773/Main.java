package baekjoon.datastructure.datastructure_10773;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            if(input == 0){
                stack.pop();
            }else{
                stack.push(input);
            }
        }
        while(!stack.isEmpty()){
            sum+=stack.peek();
            stack.pop();
        }
        System.out.println(sum);
    }
}
