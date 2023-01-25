class Solution {
    public int solution(int n, int k) {
        int yang = n*12000;
        int drink;
        if(n/10<k)
        {
            yang = yang+(k-(n/10))*2000;
        }
        
        return yang;
    }
}