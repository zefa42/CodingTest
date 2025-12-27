package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Number_4358 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new TreeMap<>();

        String line;
        int total = 0;

        while ((line = br.readLine()) != null) {
            map.put(line, map.getOrDefault(line, 0) + 1);
            total++;
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            double percent = (double) entry.getValue() * 100 / total;
            sb.append(entry.getKey())
                    .append(" ")
                    .append(String.format("%.4f", percent))
                    .append('\n');
        }

        System.out.print(sb);
    }
}
