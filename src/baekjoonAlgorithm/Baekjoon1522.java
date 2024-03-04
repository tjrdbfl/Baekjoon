package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon1522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();

        int cntA=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a') cntA++;
        }

        int cntB=0;
        for(int i=0;i<cntA;i++){
            if(str.charAt(i)=='b') cntB++;
        }

        int min=cntB;
        int start=0,end=cntA-1;
        while(start<str.length()){
            if(str.charAt(++end%str.length())=='b') cntB++;
            if(str.charAt(start++)=='b') cntB--;

            min=Math.min(min,cntB);
        }
        System.out.println(min);
    }
}
