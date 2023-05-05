import java.util.*;
import java.util.stream.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        IntStream.range(0,n)
            .mapToObj(i -> str)
            .forEach(System.out::print);
    }
}