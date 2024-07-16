import java.util.HashSet;
import java.util.Objects;

class Solution {
    int[][] dir = {{0,0},{1,0},{0,1},{1,1}};
    int answer = 0, M, N;
    char[][] arr;
    boolean check = true;
    HashSet<Node> hs;
    public int solution(int m, int n, String[] board) {
        this.M = m;
        this.N = n;
        arr = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = board[i].charAt(j);
            }
        }

        while (check){
            check = false;

            hs = new HashSet<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j]=='X') continue;
                    removeCheck(i,j);
                }
            }

            for (Node h : hs) {
                arr[h.x][h.y] = 'X';
            }

            cleaning();

            answer+=hs.size();
        }
        return answer;
    }

    private void cleaning() {
        for (int j = 0; j < N; j++) {
            for (int i = M - 1; i > 0; i--) {
                if (arr[i][j] == 'X') {
                    int k = i - 1;
                    while (k >= 0 && arr[k][j] == 'X') {
                        k--;
                    }
                    if (k >= 0) {
                        arr[i][j] = arr[k][j];
                        arr[k][j] = 'X';
                    }
                }
            }
        }
    }

    private void removeCheck(int m, int n) {
        char target = arr[m][n];
        boolean removable = true;
        for (int i = 0; i < 4&&removable; i++) {
            int dx = m + dir[i][0];
            int dy = n + dir[i][1];

            if(movable(dx,dy)) removable = target == arr[dx][dy];
            else removable = false;
        }
        if(removable){
            check = true;
            for (int i = 0; i < 4; i++) {
                int dx = m + dir[i][0];
                int dy = n + dir[i][1];
                hs.add(new Node(dx,dy));
            }
        }
    }

    private boolean movable(int dx, int dy) {
        return !(dx<0||dy<0||dx>=M||dy>=N);
    }

    class Node{
        int x;
        int y;
        Node(int x,int y){
            this.x = x;
            this.y =y;
        }

        @Override
        public boolean equals(Object o) {
            Node node = (Node) o;
            return x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}