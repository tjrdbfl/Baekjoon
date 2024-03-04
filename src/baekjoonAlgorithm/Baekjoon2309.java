package baekjoonAlgorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2309 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[9];
        int sum=0;
        int num1=0,num2=0;

        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
            sum+= arr[i];
        }

        Arrays.sort(arr);

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(sum-arr[i]-arr[j] == 100){
                    num1=arr[i];
                    num2=arr[j];
                }
            }
        }

        for(int i=0;i< arr.length;i++){
            if(arr[i]!= num1 && arr[i]!=num2){
                System.out.println(arr[i]);
            }
        }

    }
}

