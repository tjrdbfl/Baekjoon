package baekjoonAlgorithm;
/*
* 백준 21758. 꿀 따기
* */
import java.util.Scanner;

public class Baekjoon2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=0;
        int bee1,bee2,beehive;
        int max=0,sum=0,sum1=0,sum2=0;

        n=sc.nextInt();
        int[] arr=new int[n];


        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i = 0; i < arr.length; i++) {
            beehive=i;
            for(int j = 0; j < arr.length; j++) {
                bee1=j;
                if(beehive!=bee1){
                    for(int k = 0; k < arr.length; k++) {
                        bee2=k;

                        if(beehive==bee2){
                            continue;
                        }else if(bee1==bee2){
                            continue;
                        }else {
                            sum1 = findSum(bee1, bee2, beehive, arr);
                            sum2 = findSum(bee2, bee1, beehive, arr);

                            sum = sum1 + sum2;

                            if(max < sum){
                                max=sum;
                            }

                        }
                    }

                }
            }
        }

        System.out.println(max);
    }
    public static int findSum(int bee1,int bee2,int beehive, int[] arr){
        int sum=0;
        if(bee1<beehive){
            for(int i=bee1+1;i<=beehive;i++){
                sum += arr[i];
            }
            if(bee2>bee1 && bee2<beehive) {
                sum-=arr[bee2];
            }
        }else{
            for(int i=bee1-1;i>=beehive;i--){
                sum += arr[i];
            }
            if(bee2<bee1 && bee2>beehive) {
                sum-=arr[bee2];
            }
        }


        return sum;
    }

}