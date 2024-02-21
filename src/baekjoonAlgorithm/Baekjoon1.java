package baekjoonAlgorithm;
/*
* 백준 2309. 일곱난쟁이
* */
import java.util.Scanner;

public class Baekjoon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] dwarf = new int[9];
        int sum = 0;
        int a = 0, b = 0;

        for (int i = 0; i < dwarf.length; i++)  {
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }

        //Array.sort(dwarf);
        for(int q = 0; q < dwarf.length; q++)   {
            for(int w = 0; w < dwarf.length; w++) {
                if(dwarf[q] < dwarf[w]) {
                    int temp = dwarf[q];
                    dwarf[q] = dwarf[w];
                    dwarf[w] = temp;
                }
            }
        }

        for (int x = 0; x < dwarf.length; x++)  {
            for (int y = x + 1; y < dwarf.length; y++)  {
                if(sum - dwarf[x] - dwarf[y] == 100)    {
                    a = dwarf[x];
                    b = dwarf[y];
                }
            }
        }

        for (int i = 0; i < dwarf.length; i++)  {
            if (dwarf[i] != a && dwarf[i] != b) {
                System.out.println(dwarf[i]);
            }
        }
    }
}
