class Solution {
    public int solution(int n) {
        double po = Math.sqrt((double)n);
        if(((double)n)%po==0)
            return 1;
        return 2;
    }
}