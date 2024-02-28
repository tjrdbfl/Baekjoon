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

        String accept="> is acceptable.\n";
        String notAccept="> is not acceptable.\n";

        StringBuilder sb=new StringBuilder();

        while(!(password=br.readLine()).equals("end")){
            pass=password.toCharArray();
            prev='.';
            count=0;
            flag=false;

            for(char p:pass){
                //모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
                if(isVowel(p)) flag=true;
                //모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
                if(isVowel(p)!=isVowel(prev)) count=1;
                else count++;
                //같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
                if(count>2 || (prev==p && (p!='e' && p!='o'))){
                    flag=false;
                    break;
                }
                prev=p;
            }
            if(flag) sb.append('<').append(password).append(accept);
            else sb.append('<').append(password).append(notAccept);

        }
        System.out.println(sb);

    }
    static boolean isVowel(char p){
        return (p=='a')||(p=='e')||(p=='i')||(p=='o')||(p=='u');
    }
}
