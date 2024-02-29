package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[] str=br.readLine().toCharArray();

        int aSize=0;

        for(int i=0;i<str.length;i++){
            if(str[i]=='a') aSize++;
        }

        int start=0,end=aSize-1,bCount=0;
        for(int i=0;i<aSize;i++){
            if(str[i]=='a') bCount++;
        }

        int min=bCount;
        while(start<str.length){
            if(str[++end%str.length]=='b') bCount++;
            if(str[start++]=='a') bCount--;

            min=Math.min(min,bCount);
        }

        System.out.println(bCount);

    }
}
