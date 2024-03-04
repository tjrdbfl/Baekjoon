package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int amount=1000-Integer.parseInt(br.readLine());
        int cnt=0;
        int[] change={500,100,50,10,5,1};

        for(int i=0;i<change.length;i++){
            if(amount/change[i]>0){
                cnt+=amount/change[i];
                amount%=change[i];
            }
        }

        System.out.println(cnt);
    }
}
