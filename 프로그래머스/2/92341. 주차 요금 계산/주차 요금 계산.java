import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    // 60 * 23 + 59 // 자동 출차 시간 1439
    public int[] solution(int[] fees, String[] records) {
        HashMap<Integer, Park> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (String record : records) {
            StringTokenizer st = new StringTokenizer(record);
            int time = getTime(st.nextToken());
            int carNum = Integer.parseInt(st.nextToken());
            boolean isIn = st.nextToken().equals("IN");

            if (isIn) {
                if (!hm.containsKey(carNum)) {
                    al.add(carNum);
                    Park park = new Park();
                    park.parkIn(time);
                    hm.put(carNum, park);
                }else{
                    hm.get(carNum).parkIn(time);
                }
            } else {
                hm.get(carNum).parkOut(time);
            }
        }

        Collections.sort(al);

        int[] answer = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            Park park = hm.get(al.get(i));
            if(park.parking){
                park.parkOut(1439);
            }

            answer[i] = getFee(park.parkTime,fees);
        }

        return answer;
    }
    int getFee(int time, int[] fees){
        int fee = fees[1];
        time -= fees[0];
        if(time>0){
            int a = time / fees[2];
            if(time % fees[2] !=0) a++;

            fee += fees[3] * a;
        }
        return fee;
    }

    class Park {

        int parkIn;
        int parkTime;
        boolean parking;
        Park() {
            this.parkIn = -1;
            parking = false;
        }

        void parkIn(int time) {
            this.parkIn = time;
            parking = true;
        }

        void parkOut(int time) {
            parkTime += time - parkIn;
            parking = false;
        }
    }

    int getTime(String time) {
        String[] t = time.split(":");
        int hour = Integer.parseInt(t[0]) * 60;
        int min = Integer.parseInt(t[1]);
        return hour + min;
    }
}