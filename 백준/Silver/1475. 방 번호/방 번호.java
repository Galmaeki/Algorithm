import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        String s= br.readLine();

        int nums[] = new int[10];

        for(char a : s.toCharArray()){
            nums[a-48]++;
        }

        int sixs=(nums[6]+nums[9]+1)/2;

        for (int i = 0; i < 9; i++) {
            if(ans<nums[i]&&i!=6&&i!=9) {
                ans = nums[i];
            }
        }

        if(ans<sixs)
            System.out.println(sixs);
        else
            System.out.println(ans);
    }
}