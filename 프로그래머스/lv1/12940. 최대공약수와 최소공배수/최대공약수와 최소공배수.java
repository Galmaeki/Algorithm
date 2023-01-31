class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min=0,max=0;
        min=Ec(n,m);
        max=(n*m)/min;
        answer[0]=min;
        answer[1]=max;
        return answer;
    }
    static int Ec(int a, int b){
        if(b==0)
            return a;
        return Ec(b,a%b);
    }
}