import java.util.HashMap;

class Solution {

    HashMap<String, Node> hm;

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        hm = new HashMap<>();
        hm.put("CENTER", new Node());
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            hm.put(enroll[i], new Node());
        }

        for (int i = 0; i < referral.length; i++) {
            if (referral[i].equals("-")) {
                continue;
            }
            Node node = hm.get(enroll[i]);
            node.mother = referral[i];
        }

        for (int i = 0; i < seller.length; i++) {
            Node node = hm.get(seller[i]);
            node.earnMoney(amount[i] * 100);
        }

        for (int i = 0; i < enroll.length; i++) {
            answer[i] = hm.get(enroll[i]).money;
        }

        return answer;
    }

    class Node {

        int money;
        String mother;

        public Node() {
            money = 0;
            mother = "CENTER";
        }

        void earnMoney(int earnMoney) {
            int motherMoney = (int) (earnMoney * 0.1);
            this.money += earnMoney - motherMoney;

            if (motherMoney >= 1 && hm.containsKey(mother)) {
                Node node = hm.get(mother);
                node.earnMoney(motherMoney);
            }
        }
    }
}