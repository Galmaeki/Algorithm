import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int arr[][] = new int[count][2];
        int answer =0;
        int startTime=0;
        int endTime=0;


        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, ((o1, o2) ->
                //오름차순 정렬
            o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1]
        ));

        for (int i = 0; i < count; i++) {
            if(arr[i][0]>=endTime&&arr[i][0]>=startTime){
                answer++;
                endTime = arr[i][1];
                startTime = arr[i][0];
            }
        }

        System.out.println(answer);
    }
}