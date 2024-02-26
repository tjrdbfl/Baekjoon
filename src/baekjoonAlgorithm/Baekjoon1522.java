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

        //기존 set 1에서 b의 개수를 구함
        int start=0,end=aSize-1,bCount=0;
        for(int i=0;i<aSize;i++){
            if(str[i]=='a') bCount++;
        }

        //set 1 의 b의 개수를 min으로 설정하고, 슬라이딩 하면서 b의 갯수 변화 check
        int min=bCount;
        while(start<str.length){
            //%str.length: index 범위 벗어나는 오류 방지
            if(str[++end%str.length]=='b') bCount++;
            if(str[start++]=='a') bCount--;

            min=Math.min(min,bCount);
        }

        System.out.println(bCount);

    }
}
