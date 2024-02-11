import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        String[] arr = new String[count];

        for (int i = 0; i < count; i++) {
            arr[i]=br.readLine();
        }

        char[] answer = arr[0].toCharArray();

        if(count==1){
            System.out.println(arr[0]);
        }else{

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if(answer[j]=='?') continue;
                if(arr[i].charAt(j)!=answer[j]) answer[j]='?';
            }
        }

        for (char c : answer) {
            sb.append(c);
        }

        System.out.println(sb);
        }
    }
}