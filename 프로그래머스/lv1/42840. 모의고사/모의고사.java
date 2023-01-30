import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        int idiots[] = new int[3];
        int[] idiot1Ans = {1, 2, 3, 4, 5}, idiot2Ans = {2, 1, 2, 3, 2, 4, 2, 5}, idiot3Ans = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int re = 0, extAns = 0;//탈출용변수//정답을 꺼내줄 변수
        int idi1Ext = 0, idi2Ext = 0, idi3Ext = 0;//수포자들의 정답을 꺼내줄 변수
        while (re< answers.length) {
            if(answers[re]==idiot1Ans[idi1Ext])
                idiots[0]+=1;
            if(answers[re]==idiot2Ans[idi2Ext])
                idiots[1]+=1;
            if(answers[re]==idiot3Ans[idi3Ext])
                idiots[2]+=1;
            //if (re == answers.length - 1) {
            //    re = 0;
            //} else {
            //    re++;
            //    }//정답 카운터
            if (idi1Ext == 4) {
                idi1Ext = 0;
            } else {
                idi1Ext++;
            }//수포1카운터
            if (idi2Ext == 7) {
                idi2Ext = 0;
            } else {
                idi2Ext++;
            }//수포2카운터
            if (idi3Ext == 9) {
                idi3Ext = 0;
            } else {
                idi3Ext++;
            }//수포3카운터
            re++;
        }
        int[] answer=null;
        int count = 0;
        int max=Math.max(idiots[0],0);
        max=Math.max(idiots[1],max);
        max=Math.max(idiots[2],max);
        for (int i = 0; i < 3; i++) {
            if(max==idiots[i])
                count++;
        }
        if(count==3){
            answer = new int[]{1,2,3};
        }int cou=0;
        if(count==2){
            answer = new int[2];
            for (int i = 0; i < 3; i++) {
                if(idiots[i]==max){
                    answer[cou]=i+1;
                    cou++;
                }
            }
            }
        if(count==1){
            answer = new int[1];
            for (int i = 0; i < 3; i++) {
                if(idiots[i]==max){
                    answer[cou]=i+1;
                    cou++;
                }
            }
        }
        return answer;
    }
}