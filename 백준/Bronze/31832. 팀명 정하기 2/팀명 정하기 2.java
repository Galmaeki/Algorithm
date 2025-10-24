import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (name.length() < 11) {
                if (isNotDigit(name)) {
                    if (moreBig(name)) {
                        System.out.println(name);
                        break;
                    }
                }
            }
        }
    }

    private static boolean moreBig(String name) {
        int U = 0, L = 0;
        for (int i = 0; i < name.length(); i++) {
            if(!Character.isDigit(name.charAt(i))){
                if(Character.isUpperCase(name.charAt(i))) U++;
                else L++;
            }
        }
        return L>=U;
    }

    private static boolean isNotDigit(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isDigit(name.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}