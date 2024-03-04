package baekjoonAlgorithm;

import java.util.*;
public class Baekjoon1931 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] time = new int[sc.nextInt()][2];

        int cnt = 0;
        int prevTime = 0;

        for(int i = 0; i < time.length; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }

        Arrays.sort(time,((o1, o2) -> {
            if(o1[1]==o2[1])
                return o1[0]-o2[0];
            else return o1[1]-o2[1];
        }));


        for(int i = 0; i < time.length; i++) {
            if (prevTime <= time[i][0]) {
                prevTime = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}

