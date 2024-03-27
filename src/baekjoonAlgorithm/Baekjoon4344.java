package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Baekjoon4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int number=0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            number=Integer.parseInt(st.nextToken());
            int[] arr=new int[number];
            int j=0;

            while(st.hasMoreTokens()) {
                arr[j++]=Integer.parseInt(st.nextToken());
            }
            double average=Arrays.stream(arr).average().getAsDouble();

            System.out.printf("%.3f%%\n",(double)(Arrays.stream(arr).filter(value->value>average).count())*100/number);
        }
    }
}
