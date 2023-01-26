class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=0,maxs=0;
        int count =0;
        for (int j = 0;j<numbers.length;j++){
                if (numbers[j]>=max){
                    max = numbers[j];
                    count = j;
                }
            }
        for (int i = 0;i<numbers.length;i++){
            if (i!=count){
                maxs=Math.max(numbers[i],maxs);
            }
        }
        return max*maxs;
    }
}