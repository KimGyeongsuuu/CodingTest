package baekjoon.datastructure.datastructure_10845;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int num = 0;
        int last = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String Command = st.nextToken();
            if(Command.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                queue.add(num);
                last = num;
            }else if(Command.equals("pop")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{
                System.out.println(queue.poll());
                }
            } else if(Command.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                }else{
                    System.out.println(queue.peek());
                }
            }else if(Command.equals("back")){
                if(queue.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(last);
                }
            } else if (Command.equals("size")) {
                System.out.println(queue.size());
            }else if(Command.equals("empty")){
                if(queue.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }

        }
    }
}
