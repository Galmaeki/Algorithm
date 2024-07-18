class Solution {

    int[][] dir = {{1, 0}, {0, 1}, {-1, -1}};
    int[][] arr;
    int N, dirN;

    public int[] solution(int n) {
        arr = new int[n][n];
        N = n;
        int curNumber = 1;
        int endNum = getLastNum(n);
        dirN = 0;
        int x = 0, y = 0;
        int[] answer = new int[endNum];

        while (curNumber <= endNum) {
            arr[x][y] = curNumber++;
            if (!movable(x, y)) {
                if(dirN==2) dirN = 0;
                else dirN++;
            }

            x += dir[dirN][0];
            y += dir[dirN][1];
        }

        int ind = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j]!=0){
                    answer[ind] = arr[i][j];
                    ind++;
                }else j = N;
            }
        }
        return answer;
    }

    private boolean movable(int x, int y) {
        int dx = x + dir[dirN][0];
        int dy = y + dir[dirN][1];
        if (dx >= N || dy >= N) return false;
        return arr[dx][dy] == 0;
    }

    private int getLastNum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + getLastNum(n - 1);
    }
}