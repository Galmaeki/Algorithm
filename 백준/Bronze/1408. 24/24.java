import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] startTime = br.readLine().split(":");
        String[] endTime = br.readLine().split(":");

        int[] stT = {Integer.parseInt(startTime[0]),Integer.parseInt(startTime[1]),Integer.parseInt(startTime[2])};
        int[] edT = {Integer.parseInt(endTime[0]),Integer.parseInt(endTime[1]),Integer.parseInt(endTime[2])};
        int[] answerT = new int[3];

        answerT[2] = edT[2]-stT[2];
        answerT[1] = edT[1]-stT[1];
        answerT[0] = edT[0]-stT[0];

        if(answerT[2]<0){
            answerT[1]-=1;
            answerT[2]+=60;
        }

        if(answerT[1]<0){
            answerT[0]-=1;
            answerT[1]+=60;
        }

        if(answerT[0]<0){
            answerT[0]+=24;
        }

        sb.append(answerT[0]<10?"0"+answerT[0]:answerT[0]).append(":")
            .append(answerT[1]<10?"0"+answerT[1]:answerT[1]).append(":")
            .append(answerT[2]<10?"0"+answerT[2]:answerT[2]);

        System.out.println(sb);
    }
}