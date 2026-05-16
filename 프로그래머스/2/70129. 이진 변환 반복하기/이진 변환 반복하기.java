class Solution {
    int answer[] = new int[2];
        public int[] solution(String s) {
            answer[0]++;
            String r = s.replace("0", "");
            answer[1] += s.length() - r.length();

            String rStr = Integer.toBinaryString(r.length());

            if (!rStr.equals("1")) {
                solution(rStr);
            }
            return answer;
        }
}