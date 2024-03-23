package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int[] arr=new int[3];
        int amount=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        if(arr[0]==arr[1] && arr[1]==arr[2]){
            amount=10000+arr[0]*1000;
        }else if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[2]){
            amount=Arrays.stream(arr).max().getAsInt()*100;
        }else if(arr[0]==arr[1] || arr[0]==arr[2]){
            amount=1000+arr[0]*100;
        }else{
            amount=1000+arr[1]*100;
        }
        System.out.println(amount);


    }
}
