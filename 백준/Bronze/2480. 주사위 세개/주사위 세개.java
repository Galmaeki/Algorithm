import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int answer = 0;
        String[] strs = br.readLine().split(" ");
        int[] nums = new int[3];
        nums[0]=Integer.parseInt(strs[0]);
        nums[1]=Integer.parseInt(strs[1]);
        nums[2]=Integer.parseInt(strs[2]);

        Arrays.sort(nums);

        if(nums[0]==nums[1]&&nums[1]==nums[2]) answer+=10000+nums[0]*1000;
        else if (nums[0]==nums[1]) {
            answer+=1000+nums[0]*100;
        } else if (nums[1] == nums[2]) {
            answer+=1000+nums[1]*100;
        } else {
            answer+=nums[2]*100;
        }

        System.out.println(answer);
    }
}