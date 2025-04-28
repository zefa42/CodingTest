import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Number_16170 {
    public static void main(String[] args) {
        // 현재 서울 시간(UTC+9) 가져오기
        ZonedDateTime seoulTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        
        // UTC+0으로 변환
        ZonedDateTime utcTime = seoulTime.withZoneSameInstant(ZoneId.of("UTC"));
        
        // 연도, 월, 일 출력
        System.out.println(utcTime.getYear());
        System.out.printf("%02d%n", utcTime.getMonthValue());
        System.out.printf("%02d%n", utcTime.getDayOfMonth());
    }
}