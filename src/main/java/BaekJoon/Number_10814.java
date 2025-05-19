import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Number_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        List<Member> members = new ArrayList<>();

        for(int i = 0; i < count; ++i) {
            String[] input = bufferedReader.readLine().split(" ");
            members.add(new Member(Integer.parseInt(input[0]), input[1]));
        }

        members.sort(Comparator.comparingInt(o -> o.age));

        StringBuilder result = new StringBuilder();

        for(Member member : members) {
            result.append(member.age).append(" ").append(member.name).append('\n');
        }
        System.out.println(result.toString());
    }

    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
