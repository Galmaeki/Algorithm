import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0;i<a;i++){
            sb.append("LoveisKoreaUniversity ");
        }
        System.out.println(sb);
        sc.close();
    }
}