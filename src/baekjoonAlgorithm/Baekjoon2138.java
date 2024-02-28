package baekjoonAlgorithm;
import java.util.Scanner;

public class Baekjoon2138 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans1 = 1, ans2 = 0, INF = 987654321;
        String now = sc.next();
        String expect = sc.next();

        int[] test1 = new int[n];
        int[] test2 = new int[n];
        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            test1[i] = now.charAt(i)-'0';
            test2[i] = now.charAt(i)-'0';
            answer[i] = expect.charAt(i)-'0';
        }
        test1[0] = 1-test1[0];
        test1[1] = 1-test1[1];

        for(int i = 1; i < n; i++) {
            if(test1[i-1] != answer[i-1]) {
                test1[i-1] = 1 - test1[i-1];
                test1[i] = 1 - test1[i];
                ans1++;
                if(i != n-1)
                    test1[i+1] = 1 - test1[i+1];

            }
            if(test2[i-1] != answer[i-1]) {
                test2[i-1] = 1 - test2[i-1];
                test2[i] = 1 - test2[i];
                ans2++;
                if(i != n-1)
                    test2[i+1] = 1 - test2[i+1];
            }
        }

        if(test1[n-1] != answer[n-1]) ans1 = INF;
        if(test2[n-1] != answer[n-1]) ans2 = INF;


        if(ans1 == INF && ans2 == INF)
            System.out.println(-1);
        else
            System.out.println(Math.min(ans1, ans2));
    }
}
