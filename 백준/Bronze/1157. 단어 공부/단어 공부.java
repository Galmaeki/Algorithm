import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxVal = 0;
        int maxInd = 0;
        int num =0;
        int a = 0;

        int alphabet[] = new int[26];

        String str = br.readLine().toUpperCase();

        for (char b : str.toCharArray()) {
            alphabet[b-65]++;
        }

        for (int i = 0; i < 26; i++) {
            if(maxVal<alphabet[i]){
                maxVal = alphabet[i];
                maxInd = i;
            }
        }
        num = maxVal;

        for (int i : alphabet) {
            if(i==num&&a==0){
                a = 1;
            } else if (i == num && a==1) {
                a = 2;
            }
        }

        if(a==2){
            System.out.println("?");
        }else{
            System.out.println((char)(maxInd+65));
        }

    }
}