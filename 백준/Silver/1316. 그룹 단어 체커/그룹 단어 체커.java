import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        for (int i = 0; i < loop; i++) {
            checker(br.readLine());
        }
        System.out.println(count);
    }

    static void checker(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        if (str.length() == 1) {
            count++;
        } else {
            hm.put(str.charAt(0), 0);
            for (int i = 1; i < str.length(); i++) {
                if (!(str.charAt(i) == str.charAt(i - 1))) {//바로 앞글자랑 다른수가 나오면
                    if (hm.get(str.charAt(i)) == null) {//char로 검색먼저 해보고 없다면
                        hm.put(str.charAt(i), 0);
                    } else {//검색해보고 있으면 포문을 깸
                        break;
                    }
                }
                if (i == (str.length() - 1)) {
                    count++;
                }
            }
        }
    }
}