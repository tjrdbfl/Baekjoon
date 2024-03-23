package baekjoonAlgorithm;

import java.io.*;
import java.util.StringTokenizer;


public class Baekjoon2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(br.readLine());

        System.out.println((a+(b+c)/60)%24+" "+(b+c)%60);

    }
}
