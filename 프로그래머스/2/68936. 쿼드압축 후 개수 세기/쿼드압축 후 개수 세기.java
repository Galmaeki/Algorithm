import java.util.ArrayList;

class Solution {
    int[][] arr;
    int[] answer = {0,0};
    public int[] solution(int[][] arr) {
        this.arr = arr;
        dp(0,0,arr.length);
        return answer;
    }

    private void dp(int x, int y, int size) {
        if (check(x, y, size)) {
            answer[arr[x][y]]++;
            return;
        }

        dp(x, y, size/2);
        dp(x+size /2, y, size/2);
        dp(x, y + size /2, size/2);
        dp(x+size /2, y + size /2, size/2);
    }

    private boolean check(int x, int y, int size) {
        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if(arr[x][y] != arr[i][j])return false;
            }
        }
        return true;
    }
}