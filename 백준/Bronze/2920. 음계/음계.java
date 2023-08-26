import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int number;
        if (Integer.parseInt(str[0]) == 1) {
            number = 1;
            System.out.println(ascending(number,str));
        } else if (Integer.parseInt(str[0]) == 8) {
            number = 8;
            System.out.println(descending(number,str));
        } else{
            System.out.println("mixed");
        }
        for (int i = 0; i < 8; i++) {

        }
    }

    private static String descending(int number, String[] str) {
        for (int i = 0; i < 8; i++) {
            if(Integer.parseInt(str[i]) != number){
                return "mixed";
            }
            number--;
        }
        return "descending";
    }

    private static String ascending(int number, String[] str) {
        for (int i = 0; i < 8; i++) {
            if(Integer.parseInt(str[i]) != number){
                return "mixed";
            }
            number++;
        }
        return "ascending";
    }
}