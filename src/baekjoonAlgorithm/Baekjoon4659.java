package baekjoonAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String password;
        char[] pass;
        boolean flag;
        char prev;
        int count;

        StringBuilder sb=new StringBuilder();

        while(!(password=br.readLine()).equals("end")){
            pass=password.toCharArray();
            prev='.';
            count=0;
            flag=false;

            for(char p:pass){
                if(isVowel(p)) flag=true;
                if(isVowel(p)!=isVowel(prev)) count=1;
                else count++;

                if(count>2 || (prev==p && (p!='e' && p!='o'))){
                    flag=false;
                    break;
                }
                prev=p;
            }
            if(flag) sb.append('<').append(password).append("> is acceptable.\n");
            else sb.append('<').append(password).append("> is not acceptable.\n");

        }
        System.out.println(sb);

    }
    static boolean isVowel(char p){
        return (p=='a')||(p=='e')||(p=='i')||(p=='o')||(p=='u');
    }
}
