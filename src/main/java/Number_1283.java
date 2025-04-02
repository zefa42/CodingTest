import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Number_1283 {
    static List<Character> alphabets = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; ++i) {
            String input = bufferedReader.readLine();
            result.append(getShortcutKey(alphabets, input)).append('\n');
        }
        System.out.println(result);
    }

    private static String getShortcutKey(List<Character> alphabets, String input) {
        StringBuilder result = new StringBuilder();
        if(input.contains(" ")) {
            String[] splitedString = input.split(" ");
            boolean isShortcut = false;
            for(int i = 0; i < splitedString.length; ++i) {
                if (!alphabets.contains(Character.toLowerCase(splitedString[i].charAt(0)))) {
                    alphabets.add(Character.toLowerCase(splitedString[i].charAt(0)));
                    splitedString[i] = splitedString[i].replace(splitedString[i].substring(0, 1), "[" + splitedString[i].charAt(0) + "]");
                    isShortcut = true;
                    break;
                }
            }
            if(!isShortcut) {
                OuterLoop:
                for(int i = 0; i < splitedString.length; ++i) {
                    for(int j = 1; j < splitedString[i].length(); ++j) {
                        if (!alphabets.contains(Character.toLowerCase(splitedString[i].charAt(j)))) {
                            alphabets.add(Character.toLowerCase(splitedString[i].charAt(0)));
                            splitedString[i] = splitedString[i].replace(splitedString[i].substring(j, j + 1), "[" + splitedString[i].charAt(j) + "]");
                            break OuterLoop;
                        }
                    }
                }
            }
            for (String s : splitedString) {
                result.append(s).append(" ");
            }


            return result.toString();
        }
        for(int i = 0; i < input.length(); ++i) {
            if(!alphabets.contains(Character.toLowerCase(input.charAt(i)))) {
                alphabets.add(Character.toLowerCase(input.charAt(i)));
                return input.replace(input.substring(i, i + 1), "[" + input.charAt(i) + "]");}
        }
        return input;
    }
}
