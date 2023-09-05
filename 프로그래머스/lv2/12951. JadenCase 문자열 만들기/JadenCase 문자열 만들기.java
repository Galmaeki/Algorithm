class Solution {
    public String solution(String a) {
        StringBuilder sb = new StringBuilder();
        boolean nextC = true; // 다음 문자를 대문자로 시작해야 하는지 여부

        for (char c : a.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (nextC) {
                    sb.append(Character.toUpperCase(c));
                    nextC = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else if(Character.isDigit(c)){
                sb.append(c);
                nextC = false;
            } else {
                sb.append(c);
                nextC = true; // 다음 문자를 대문자로 시작해야 함
            }
        }
        return sb.toString();
    }
}
