import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(calculate(readAlphabets(bufferedReader)));
    }

    private static String readAlphabets(BufferedReader bufferedReader) throws IOException {
        String alphabets = bufferedReader.readLine();
        validateEmpty(alphabets);
        validateLength(alphabets);
        validateUpperCase(alphabets);
        return alphabets;
    }

    private static void validateUpperCase(String alphabets) {
        for(int i = 0; i < alphabets.length(); ++i) {
            if(!Character.isUpperCase(alphabets.charAt(i))) {
                throw new IllegalArgumentException();
            }
        }
    }

    private static void validateEmpty(String alphabets) {
        if(alphabets == null || alphabets.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateLength(String alphabets) {
        if(alphabets.length() > 15 || alphabets.length() < 2) {
            throw new IllegalArgumentException();
        }
    }

    private static int calculate(String alphabets) {
        int time = 0;
        for(int i = 0; i < alphabets.length(); ++i) {
            if(alphabets.charAt(i) >= 65 && alphabets.charAt(i) < 68) {
                time += 3;
            }
            if(alphabets.charAt(i) >= 68 && alphabets.charAt(i) < 71) {
                time += 4;
            }
            if(alphabets.charAt(i) >= 71 && alphabets.charAt(i) < 74) {
                time += 5;
            }
            if(alphabets.charAt(i) >= 74 && alphabets.charAt(i) < 77) {
                time += 6;
            }
            if(alphabets.charAt(i) >= 77 && alphabets.charAt(i) < 80) {
                time += 7;
            }
            if(alphabets.charAt(i) >= 80 && alphabets.charAt(i) < 84) {
                time += 8;
            }
            if(alphabets.charAt(i) >= 84 && alphabets.charAt(i) < 87) {
                time += 9;
            }
            if(alphabets.charAt(i) >= 87 && alphabets.charAt(i) < 91) {
                time += 10;
            }
        }
        return time;
    }
}
