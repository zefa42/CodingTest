import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Number_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            students.add(new Student(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3])));
        }
        students.sort((s1, s2) -> {
            if (s1.korean != s2.korean) {
                return s2.korean - s1.korean;
            }
            if (s1.english != s2.english) {
                return s1.english - s2.english;
            }
            if (s1.math != s2.math) {
                return s2.math - s1.math;
            }
            return s1.name.compareTo(s2.name);
        });

        StringBuilder result = new StringBuilder();
        for(Student student : students) {
            result.append(student.name).append('\n');
        }
        System.out.println(result);
    }

    static class Student {
        private final String name;
        private final int korean;
        private final int english;
        private final int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }


    }
}
