class Solution {
    public int solution(int n) {
        int e[]= new int[10];
        for (int i = 0; i < e.length; i++) {
            if (i==0)
            {
                e[i]=1;
            }else{
                e[i]=e[i-1]*(i+1);
            }

        }
        int c = 9;
        while(true)
        {
            if (n-e[c]>=0||c==0)
            {
                c++;
                break;
            }
            c--;
            
        }
        return c;
    }
}