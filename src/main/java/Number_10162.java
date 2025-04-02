import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_10162 {
    static final int fiveMinutes = 300;
    static final int oneMinute = 60;
    static final int tenSeconds = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(bufferedReader.readLine());
        System.out.println(getResult(time));
    }

    private static String getResult(int time) {
        int fiveMinutesCount = 0;
        int oneMinuteCount = 0;
        int tenSecondsCount = 0;
        int tmp = time;

        if(tmp >= fiveMinutes) {
                fiveMinutesCount += (tmp / fiveMinutes);
                tmp %= fiveMinutes;
        }
        if(tmp >= oneMinuteCount) {
                oneMinuteCount += (tmp / oneMinute);
                tmp %= oneMinute;
        }
        if(tmp >= tenSeconds) {
                tenSecondsCount += (tmp / tenSeconds);
                tmp %= tenSeconds;
        }

        if(tmp != 0) {
                return "-1";
        }
        return fiveMinutesCount + " " + oneMinuteCount + " " + tenSecondsCount;
    }
}
