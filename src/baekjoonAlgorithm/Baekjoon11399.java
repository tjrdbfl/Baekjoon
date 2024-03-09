package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int[] arr=new int[n];

        for (int i=0;i<n;i++){
            arr[i]= Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);

        int sum=0;
        for(int i:arr){
            sum+=i*(n--);
        }
        System.out.println(sum);
    }
}
