package baekjoon.datastructure.datastructure_7785;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<String>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")){
                set.add(name);
            }else{
                set.remove(name);
            }
        }
        List<String> companyList = new ArrayList<String>(set);
        Collections.sort(companyList,Collections.reverseOrder());
        for(String company : companyList){
            sb.append(company);
            sb.append("\n");
        }

        bw.write(sb.toString());


        br.close();
        bw.flush();
        bw.close();
    }
}
