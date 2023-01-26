class Solution {
    public int solution(int hp) {
        int health = hp;
        int answer = 0;
        while(health>=5)
        {
            health-=5;
            answer++;
        }
        while(health>=3){
            health-=3;
            answer++;
        }
        answer+=health;
        return answer;
    }
}