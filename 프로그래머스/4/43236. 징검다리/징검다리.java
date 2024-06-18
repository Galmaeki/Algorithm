import java.util.Arrays;

class Solution {

    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;

        Arrays.sort(rocks);

        int l = 1;
        int r = distance;

        while (l <= r) {
            int mid = (l + r) / 2;
            int delete = 0;
            int start = 0;

            for (int i = 0; i < rocks.length; i++) {
                if (rocks[i] - start < mid) {
                    delete++;
                } else {
                    start = rocks[i];
                }
            }

            if (distance - start < mid) {
                delete++;
            }

            if (delete > n) {
                r = mid - 1;
            } else {
                answer = mid;
                l = mid + 1;
            }

        }

        return answer;
    }
}