package baekjoonAlgorithm;

import java.util.*;

/*
 * 백준 1931. 회의실 배정
 * */

public class Baekjoon1931 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int cnt=1,temp=0;

        int[][] arr=new int[n][2];

        for(int i=0;i<arr.length;i++){
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
        }

        Arrays.sort(arr,(arr1,arr2) -> {
            if(arr1[1]==arr2[1]){
                return arr1[0]-arr2[0];
            }
            return arr1[1]-arr2[1];
        });


        for(int i=1;i < arr.length;i++){
            if(arr[i][0]>=temp){
                temp=arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}

