import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_31822 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String lecture = bufferedReader.readLine();
        int lectureCount = Integer.parseInt(bufferedReader.readLine());
        int availableLectures = 0;
        for(int i = 0; i < lectureCount; ++i) {
            String input = bufferedReader.readLine();
            if(input.substring(0, 5).equals(lecture.substring(0, 5))) {
                availableLectures++;
            }
        }
        System.out.println(availableLectures);
    }
}
