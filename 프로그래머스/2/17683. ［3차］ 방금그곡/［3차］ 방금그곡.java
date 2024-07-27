

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        String targetMusic = convert(m);

        int maxTime = 0;

        for(String info : musicinfos){
            Music music = new Music(info, m.length());
            if((music.time >= m.length()||maxTime == 0) && music.melody.contains(targetMusic)){
                if(music.time > maxTime){
                    maxTime = music.time;
                    answer = music.title;
                }
            }
        }

        return answer;
    }

    class Music{
        int time;
        String title;
        String melody;

        public Music(String info, int targetTime) {
            String[] origin = info.split(",");
            String originMelody = convert(origin[3]);
            time = getTime(origin[0],origin[1]);
            title = origin[2];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < time; i++) {
                sb.append(originMelody.charAt(i % originMelody.length()));
            }
            melody = sb.toString();
        }
    }

     String convert(String str){
        return str
            .replaceAll("C#","c")
            .replaceAll("D#","d")
            .replaceAll("F#","f")
            .replaceAll("G#","g")
            .replaceAll("B#","b")
            .replaceAll("A#","a");
    }

    int getTime(String start, String end){
        String[] startM = start.split(":");
        String[] endM = end.split(":");
        int startTime = Integer.parseInt(startM[0]) * 60 + Integer.parseInt(startM[1]);
        int endTime = Integer.parseInt(endM[0]) * 60 + Integer.parseInt(endM[1]);
        return endTime - startTime;
    }
}