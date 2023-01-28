class Solution {
    public int solution(int num) {
        int answer = 0;
        if (num==0)
            return 0;
        while(num!=1&&answer<500){
            if(num%2==0){
                num=num/2;
            } else if (num%2==1) {
                num=(num*3)+1;
            }
            answer++;
            System.out.println(answer+","+num);
        }
        if (answer==500)
        {
            answer=-1;
        }
        return answer;
    }
}