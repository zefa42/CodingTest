package Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] result = new int[size];

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < size; ++i) {
            int curTemperature = temperatures[i];
            while(!stack.isEmpty() && curTemperature > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                result[prevDay] = i - prevDay;
            }
            stack.push(i);
        }
        return result;
    }
}
