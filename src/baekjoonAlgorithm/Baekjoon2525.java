package baekjoonAlgorithm;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baekjoon2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n=Integer.parseInt(br.readLine());
        ArrayList<Point> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(br.readLine());
            int y=Integer.parseInt(br.readLine());
            list.add(new Point(x,y));
        }

        Collections.sort(list,(o1,o2)->o1.x-o2.x);
        bw.write(getMinDist(list,0,n-1)+"\n");
        bw.close();
        br.close();
    }

    private static int getMinDist(ArrayList<Point> list, int start, int end) {
        int n=end-start+1;
        int minDist;

        if(n<=3) minDist=bruteForce(list,start,end);

        int mid=(start+end)/2;
        minDist=Math.min(getMinDist(list,start,mid),getMinDist(list,mid+1,end));

        ArrayList<Point> band=new ArrayList<>();
        for(int i=start;i<end;i++){
            int t=list.get(mid).x-list.get(i).x;

            if(t*t<minDist) band.add(list.get(i));
        }

        Collections.sort(band,(o1,o2)->  o1.y-o2.y);

        for(int i=0;i<band.size()-1;i++){
            for(int j=i+1;j<band.size();i++) {
                int t=band.get(j).y-band.get(i).y;

                if(t*t<minDist) minDist=Math.min(getDist(band.get(i),band.get(j)),minDist);
                else break;
            }
        }
         return minDist;
    }

    private static int bruteForce(ArrayList<Point> list, int start, int end) {
        int minDist=Integer.MAX_VALUE;
        for(int i=start;i<end;i++){
            for(int j=start+1;j<=end;j++) {
                minDist=Math.min(getDist(list.get(i),list.get(j)),minDist);
            }
        }
        return minDist;
    }

    private static int getDist(Point point1, Point point2) {
        return (point1.x-point2.x)*(point1.x-point2.x)+(point1.y-point2.y)*(point1.y-point2.y);
    }
}
