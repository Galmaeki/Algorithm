import java.util.LinkedList;
import java.util.Queue;

class Solution {

    char[][] arr;
    boolean[][] visit;

    public int solution(String[] board) {
        int answer = 0;
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Node start = null;
        
        arr = new char[board.length][board[0].length()];
        visit = new boolean[board.length][board[0].length()];
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length(); j++) {
                char c = board[i].charAt(j);
                arr[i][j] = c;
                
                if (c == 'R') 
                    start = new Node(i, j, 1);
            }
        }

        Queue<Node> qu = new LinkedList<>();

        qu.add(start);

        while (!qu.isEmpty()) {
            Node x = qu.poll();
            visit[x.x][x.y] = true;

            for (int[] ints : dir) {
                int dx = x.x + ints[0];
                int dy = x.y + ints[1];

                if (!checkXY(dx, dy)) {
                    while (arr[dx][dy] != 'D') {
                        dx = dx + ints[0];
                        dy = dy + ints[1];

                        if(checkXY(dx,dy)) break;
                    }
                }

                dx = dx - ints[0];
                dy = dy - ints[1];

                if (arr[dx][dy] == 'G') {
                    return x.c;
                }

                if (!visit[dx][dy])
                    qu.add(new Node(dx, dy, x.c + 1));
            }
        }

        return answer==0?-1:answer;
    }

    private boolean checkXY(int x, int y) {

        return x < 0 || y < 0 || x >= arr.length || y >= arr[0].length;
    }

    class Node {

        int x;
        int y;
        int c;

        Node(int x, int y, int c) {
            this.x = x;
            this.y = y;
            this.c = c;
        }
    }
}