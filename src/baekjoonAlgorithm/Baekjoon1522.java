package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon1522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int aSize = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                aSize++;
            }
        }

        int start = 0, bCnt = 0, end = aSize - 1;
        for(int i = 0; i < aSize; i++){
            if(str.charAt(i) == 'b') bCnt++;
        }

        int min = bCnt;
        while(start < str.length()){
            if(str.charAt(++end % str.length()) == 'b') bCnt++;
            if(str.charAt(start++) == 'b') bCnt--;

            min = Math.min(min, bCnt);
        }

        System.out.println(min);
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        char[] str=br.readLine().toCharArray();
//
//        int aSize=0;
//
//        for(int i=0;i<str.length;i++){
//            if(str[i]=='a') aSize++;
//        }
//
//        int start=0,end=aSize-1,bCount=0;
//        for(int i=0;i<aSize;i++){
//            if(str[i]=='b') bCount++;
//        }
//
//        int min=bCount;
//        while(start<str.length){
//            if(str[++end%str.length]=='b') bCount++;
//            if(str[start++]=='a') bCount--;
//
//            min=Math.min(min,bCount);
//        }
//
//        System.out.println(min);

    }
}
