import java.util.*;

public class Solution {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)>=65&&a.charAt(i)<=90){
                sb.append((char)(a.charAt(i)+32));
            }else{
                sb.append((char)(a.charAt(i)-32));
            }
        }
        System.out.println(sb.toString());
    }
}