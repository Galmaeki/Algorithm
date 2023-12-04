import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        int i1 = color(str1), i2 = color(str2), i3 = i1*10+i2;

        long i4 = color3(str3);

        System.out.println(i4*i3);
    }

    private static long color3( String str3) {
        switch (str3){
            case "black": return 1;
            case "brown":return 10;
            case "red":return 100;
            case "orange":return 1000;
            case "yellow":return 10000;
            case "green":return 100000;
            case "blue":return 1000000;
            case "violet":return 10000000;
            case "grey":return 100000000;
            default:return 1000000000;
        }
    }

    private static int color(String str1) {
        switch (str1){
            case "black": return 0;
            case "brown":return 1;
            case "red":return 2;
            case "orange":return 3;
            case "yellow":return 4;
            case "green":return 5;
            case "blue":return 6;
            case "violet":return 7;
            case "grey":return 8;
            default:return 9;
        }
    }
}
