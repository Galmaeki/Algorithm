import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public String[] solution(String[] files) {
        ArrayList<Files> al = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            al.add(new Files(files[i], i));
        }

        Collections.sort(al);

        String[] ans = new String[al.size()];

        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i).toString();
        }

        return ans;
    }

    class Files implements Comparable<Files> {

        String head;
        String number;
        Integer trueNumber;
        String tail;
        int origin;

        Files(String file, int origin) {
            int firstDigit = -1;
            int lastDigit = -1;

            for (int i = 0; i < file.length(); i++) {
                if (Character.isDigit(file.charAt(i)) && firstDigit == -1) {
                    firstDigit = i;
                } else if (Character.isDigit(file.charAt(i)) && firstDigit != -1) {
                    if (i - firstDigit >= 5) {
                        lastDigit = i - 1;
                        break;
                    } else {
                        lastDigit = i;
                    }
                } else if (!Character.isDigit(file.charAt(i)) && firstDigit != -1) {
                    lastDigit = i - 1;
                    break;
                }
            }
            head = file.substring(0, firstDigit);

            if (lastDigit != -1) {
                number = file.substring(firstDigit, lastDigit + 1);
                trueNumber = Integer.parseInt(number);
                tail = file.substring(lastDigit+1);
            } else {
                number =file.substring(firstDigit);
                trueNumber = Integer.parseInt(number);
                tail = "";
            }
            this.origin = origin;
        }

        @Override
        public int compareTo(Files f){
            if(!head.toLowerCase().equals(f.head.toLowerCase())) return head.toLowerCase().compareTo(f.head.toLowerCase());
            if(trueNumber != f.trueNumber) return trueNumber - f.trueNumber;
            return origin - f.origin;
        }

        @Override
        public String toString() {
            return head + number + tail;
        }
    }
}