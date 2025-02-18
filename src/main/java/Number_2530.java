import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.Arrays;

public class Number_2530 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int hour = input[0];
        int minute = input[1];
        int second = input[2];
        isValidTime(hour, minute, second);
        int givenSecond = Integer.parseInt(bufferedReader.readLine());

        LocalTime time = LocalTime.of(hour, minute, second);
        time = time.plusSeconds(givenSecond);

        System.out.println(time.getHour() + " " + time.getMinute() + " " + time.getSecond());
    }

    private static void isValidTime(int hour, int minute, int second) {
        if(hour < 0 || hour > 23) {
            throw new IllegalArgumentException("시간 값을 조정해주세요");
        }

        if(minute < 0 || minute > 59) {
            throw new IllegalArgumentException("분 값을 조정해주세요");
        }

        if(second < 0 || second > 59) {
            throw new IllegalArgumentException("초 값을 조정해주세요");
        }
    }
}
