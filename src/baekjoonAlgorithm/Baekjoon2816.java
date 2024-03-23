package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2816 {
    static  String[] str;
    static int i=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        str=new String[n];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length;i++){
            str[i]=br.readLine();
        }

        while(true){
            if(!str[0].equals("KBS1")) {
                if(!str[i].equals("KBS1")){
                    sb.append("1");
                    i++;
                }else{
                    sb.append("4");
                    switchStr(str,i-1);
                    i--;
                }
            }else if(!str[1].equals("KBS2")){
                if(!str[i].equals("KBS2")){
                    sb.append("1");
                    i++;
                }else{
                    sb.append("4");
                    switchStr(str,i-1);
                    i--;
                }
            }
            else break;
        }

        System.out.println(sb);

    }

    private static void switchStr(String[] str, int i) {
        String temp=str[i];
        str[i]=str[i+1];
        str[i+1]=temp;
    }
}
