package baekjoonAlgorithm;

import java.util.Scanner;

/*
 * 백준 1931. 회의실 배정
 * */

public class Baekjoon1931 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int temp1 = 0, temp2 = 0, last = 0;
        int count = 0, mai = 0;

        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            arr[i][j++] = sc.nextInt();
            arr[i][j++] = sc.nextInt();
        }

        //오름차순 정렬
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if((arr[i][0]==arr[j][0]) && (arr[i][1]<arr[j][1])){
                    temp1 = arr[i][0];
                    temp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp1;
                    arr[j][1] = temp2;
                }
                else if (arr[i][0] < arr[j][0]) {
                    temp1 = arr[i][0];
                    temp2 = arr[i][1];
                    arr[i][0] = arr[j][0];
                    arr[i][1] = arr[j][1];
                    arr[j][0] = temp1;
                    arr[j][1] = temp2;
                }
            }
        }


        //회의의 최대 갯수 구하기
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            last = arr[i][1];
            for (int j = 0; j < arr.length; j++) {
                if (last < arr[j][0]) {
                    count++;
                    last = arr[j][1];
                }
            }

            if (mai < count) {
                mai = count;
            }
        }
        System.out.println(mai);

    }
}

