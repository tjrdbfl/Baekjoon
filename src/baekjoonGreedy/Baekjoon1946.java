package baekjoonGreedy;

import java.io.*;
import java.util.*;

public class Baekjoon1946 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] score;
        int n=0,cnt,top;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            score = new int[n][2];

            for (int j = 0; j < n; j++) {
                String[] str = br.readLine().split(" ");
                score[j][0] = Integer.parseInt(str[0]);
                score[j][1] = Integer.parseInt(str[1]);
            }

            Arrays.sort(score, (o1,o2)->{
                return o1[0]-o2[0];
            });

            top = score[0][1];
            cnt=0;
            for(int j=1;j<n;j++) {
                if(top<score[j][1]) {
                    cnt++;
                    continue;
                }
                top=score[j][1];
            }

            System.out.println(n-cnt);
        }

    }

}