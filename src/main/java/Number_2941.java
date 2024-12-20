import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_2941 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferedReader.readLine();
            System.out.println(input.length() - findCroatiaAlphabet(input));
        }

        private static int findCroatiaAlphabet(String input) {
            int result = 0;
            for(int i = 0; i<input.length()-1; ++i) {
                if(input.charAt(i) == 'c' || input.charAt(i) == 's' || input.charAt(i) == 'z') {
                    if(input.charAt(i+1) == '=') {
                        result++;
                    }
                }
                if(input.charAt(i) == 'c' || input.charAt(i) == 'd') {
                    if(input.charAt(i+1) == '-') {
                        result++;
                    }
                }
                if(input.charAt(i) == 'l' || input.charAt(i) == 'n') {
                    if(input.charAt(i+1) == 'j') {
                        result++;
                    }
                }
                if(input.charAt(i) == 'd') {
                    if(input.charAt(i+1) == 'z' && i+1 != input.length()-1 && input.charAt(i+2) == '=') {
                        result++;
                    }
                }
            }
            return result;
        }
    }
