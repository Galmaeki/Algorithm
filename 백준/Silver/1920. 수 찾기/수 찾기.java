import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int target = Integer.parseInt(br.readLine());
        int[] targets = new int[target];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < target; i++) {
            targets[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        for (int i = 0; i < target; i++) {
            solution(arr, targets[i]);
        }

        sb.setLength(sb.length()-1);

        System.out.println(sb);
    }

    private static void solution(int[] arr, int target) {
        int L = 0;
        int R = arr.length - 1;
        boolean a= false;
        while(L<=R){
            int mid = (L+R)/2;
            if(arr[mid]==target){//찾앗슴!
                a = true;
                break;
            }else if(arr[mid]<target){//타겟이 더 크니까 L을 땡겨옴
                L = mid+1;
            }else if(arr[mid]>target){//타겟이 더 작으니까 R을 땡겨옴
                R = mid-1;
            }
        }
        sb.append(a?"1":"0").append("\n");
    }
}