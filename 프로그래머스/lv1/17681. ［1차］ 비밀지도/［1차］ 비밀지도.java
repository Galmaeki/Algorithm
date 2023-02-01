class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            answer[i]=map(arr1[i]|arr2[i],n);
        }
        return answer;
    }
    
    static String map(int n,int size){
        StringBuilder sb = new StringBuilder();
        while(true){
            if(n%2==1){
                sb.append('#');
            }else{
                sb.append(' ');
            }
            n=n/2;
            if(n==0)
                break;
        }
        while(sb.length()<size)
        {sb.append(' ');}
        return sb.reverse().toString();
    }
}