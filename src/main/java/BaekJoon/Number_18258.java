import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Number_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < count; ++i) {
            String input = bufferedReader.readLine();
            if(input.contains("push")) {
                queue.add(Integer.parseInt(input.split(" ")[1]));
            }
            else if(input.equals("pop")) {
                if(queue.isEmpty()) {
                    result.append("-1").append('\n');
                }
                else {
                    result.append(queue.get(0)).append('\n');

                    queue.remove(0);
                }
            }
            else if(input.equals("size")) {
                result.append(queue.size()).append('\n');

            }
            else if(input.equals("empty")) {
                if(queue.isEmpty()) {
                    result.append("1").append('\n');

                }
                else {
                    result.append("0").append('\n');

                }
            }
            else if(input.equals("front")) {
                if(queue.isEmpty()) {
                    result.append("-1").append('\n');

                }
                else {
                    result.append(queue.get(0)).append('\n');

                }
            }
            else if(input.equals("back")) {
                if (queue.isEmpty()) {
                    result.append("-1").append('\n');

                }
                else {
                    result.append(queue.get(queue.size()-1)).append('\n');

                }
            }
        }
        System.out.print(result.toString());
    }
}
