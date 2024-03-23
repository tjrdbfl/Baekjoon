package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());

        int[] arr=new int[n];
        int cnt=0,score=0;

        for(int i=0;i<arr.length;i++){
            if((arr[i]=Integer.parseInt(st.nextToken()))==1)
                score += (++cnt);
            else
                cnt=0;
        }
        System.out.println(score);
    }
}
