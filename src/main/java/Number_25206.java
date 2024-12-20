import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] lectures = new String[20];
        double[] scores = new double[20];
        String[] grades = new String[20];
        initLecture(bufferedReader, lectures, scores, grades);
        System.out.println(calculateAverageScore(scores, grades));
    }

    private static void initLecture(BufferedReader bufferedReader, String[] lectures, double[] scores, String[] grades)
            throws IOException {
        for(int i = 0; i < 20; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            validateLectureNameLength(input[0]);
            validateScoreRange(input[1]);
            validateGradeRange(input[2]);

            lectures[i] = input[0];
            scores[i] = Double.parseDouble(input[1]);
            grades[i] = input[2];
        }
    }

    private static void validateLectureNameLength(String lecture) {
        if(lecture.isBlank() || lecture.length() > 50) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateScoreRange(String score) {
        double tmp;
        try {
            tmp = Double.parseDouble(score);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        if(!(tmp == 1.0 || tmp == 2.0 || tmp == 3.0 || tmp == 4.0)) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateGradeRange(String grade) {
        if(!(grade.equals("A+") || grade.equals("A0") || grade.equals("B+") || grade.equals("B0") || grade.equals("C+") || grade.equals("C0") || grade.equals("D+") || grade.equals("D0") || grade.equals("F") || grade.equals("P"))) {
            throw new IllegalArgumentException();
        }
    }

    private static double calculateAverageScore(double[] scores, String[] grades) {
        double sum = 0.0;
        double scoreSum = 0.0;
        for(int i = 0; i < 20; ++i) {
            if(!grades[i].equals("P")) {
                sum += scores[i] * convertGradeToScore(grades[i]);
                scoreSum += scores[i];
            }
        }
        return sum/scoreSum;
    }

    private static double convertGradeToScore(String grade) {
        double score;
        switch (grade) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            default:
                score = 0.0;
        }
        return score;
    }


}
