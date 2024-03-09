package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon12845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] str=br.readLine().split(" ");

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }

        int max= Arrays.stream(arr).max().getAsInt();
        System.out.println(Arrays.stream(arr).sum()+(n-2)*max);

    }
}