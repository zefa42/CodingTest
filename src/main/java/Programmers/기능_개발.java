package Programmers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class 기능_개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int size = progresses.length;
        int[] durations = new int[size];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < size; ++i) {
            int progress = progresses[i];
            int speed = speeds[i];
            int duration = 0;
            while(true) {
                progress += speed;
                duration++;
                if(progress >= 100) break;
            }
            durations[i] = duration;
            if(i > 0 && durations[i] < durations[i-1]) {
                durations[i] = durations[i-1];
            }
            map.put(durations[i], map.getOrDefault(durations[i], 0) + 1);
        }
        int[] result = new int[map.size()];
        int i = 0;
        for(int key : map.keySet()) {
            result[i++] = map.get(key);
        }
        return result;
    }
}
