import java.util.*;
class Solution {
    public int solution(long n) {
        int a = 0;
        ArrayList<Boolean> etos = new ArrayList<>();
        etos.add(false);
        etos.add(false);
        for (int i =2;i<=n;i++) {
            etos.add(i,true);
        }
        for(int i=2;(i*i)<=n;i++){
            if(etos.get(i)){
                for (int j = i*i; j <= n; j+=i) {
                    etos.set(j,false);
                }
            }
        }
        for (int i = 0; i < etos.size(); i++) {
            if(etos.get(i))
                a++;
        }
        return a;
    }
}