class Solution {
    static int Euclidean(int a, int b) {
        if (b == 0)
            return a;
        return Euclidean(b, a % b);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        answer[1] = denom1*denom2;
        answer[1] = answer[1]/(Euclidean(denom1,denom2));
        answer[0]=(numer1*(answer[1]/denom1))+(numer2*(answer[1]/denom2));
        int min = Euclidean(answer[0],answer[1]);
        answer[0] = answer[0]/min;
        answer[1] = answer[1]/min;
        return answer;
    }
}