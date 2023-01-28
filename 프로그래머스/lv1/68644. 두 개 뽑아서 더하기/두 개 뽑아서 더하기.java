import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList();
        for (int n: numbers) {
            arr.add(n);
        }//어레이리스트를 만들었어
        HashSet<Integer> sumHash = new HashSet<>();//해쉬셋도 만들었어
        int t = 0;//변수를 만들고
        for (int i = 0; i < numbers.length; i++) {//첫 반복문을 시작해
            //try{
            if(!arr.isEmpty())
            {
                t = arr.get(arr.size()-1);//0번째 어레이 리스트를 넣어
                arr.remove(arr.size()-1);//넣은값은 어레이리스트에서 지워줘
            }
            for (int j=0;j<arr.size();j++){//두번째 반복문을 시작해
                sumHash.add(t+ arr.get(j));//더한값을 해쉬에 넣었어
            }
        //}catch(IndexOutOfBoundsException e){
         //       break;}
            }
        System.out.println(sumHash);//지금 해쉬출력 완벽했다!이거 다 어레이에 넣고 소트해주면 댐!
        int answer[] = new int[sumHash.size()];
        Iterator<Integer> hi = (Iterator)sumHash.iterator();
        for (int i = 0;i<answer.length;i++) {
            answer[i]=hi.next();
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}