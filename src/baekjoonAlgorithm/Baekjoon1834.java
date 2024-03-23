package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());

        long sum=0;
        for(long i=1;i<n;i++){
            sum+=(n*i+i);
        }
        System.out.println(sum);
    }
}
