import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {

    int M;

    public String solution(int n, int t, int m, String[] timetable) {
        M = m;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        ArrayList<Bus> buses = new ArrayList<>();
        int conTime = 0;

        for (String s : timetable) {
            q.add(readTime(s));
        }

        int startTime = 540;

        for (int i = 0; i <n; i++) {
            buses.add(new Bus(startTime));
            startTime += t;
        }

        for (Bus bus : buses) {
            while (!q.isEmpty()){
                Integer people = q.poll();
                if(bus.canRide(people)){
                    bus.curPeoples++;
                    if (bus == buses.get(n - 1)) {
                        conTime = people - 1;
                    }
                } else {
                    q.add(people);
                    break;
                }
            }
        }

        if(buses.get(n-1).curPeoples<m) conTime = buses.get(n-1).driveTime;

        return convertTime(conTime);
    }

    int readTime(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

    String convertTime(int time){
        String hour = String.format("%02d", time/60);
        String min = String.format("%02d", time%60);
        return hour+":"+min;
    }

    class Bus {

        int maxPeoples;
        int curPeoples;
        int driveTime;

        Bus(int time) {
            driveTime = time;
            this.maxPeoples = M;
            curPeoples = 0;
        }

        boolean canRide(int time) {
            return curPeoples < maxPeoples && time <= driveTime;
        }
    }
}
