package Programmers;

public class 신규_아이디_추천 {
    public String solution(String new_id) {
        String afterFirstStep = firstStep(new_id);
        String afterSecondStep = secondStep(afterFirstStep);
        String afterThirdStep = thirdStep(afterSecondStep);
        String afterFourthStep = fourthStep(afterThirdStep);
        String afterFifthStep = fifthStep(afterFourthStep);
        String afterSixthStep = sixthStep(afterFifthStep);
        String result = seventhStep(afterSixthStep);
        return result;
    }

    //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    public String firstStep(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); ++i) {
            if(Character.isUpperCase(input.charAt(i))) {
                result.append(Character.toLowerCase(input.charAt(i)));
            }
            else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    public String secondStep(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); ++i) {
            char cur = input.charAt(i);
            if(Character.isLowerCase(cur) || Character.isDigit(cur) || cur == '-' || cur == '_' || cur == '.') {
                result.append(cur);
            }
        }
        return result.toString();
    }

    //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    public String thirdStep(String input) {
        return input.replaceAll("\\.{2,}", ".");
    }

    //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    public String fourthStep(String input) {
        if(input.length() > 1) {
            String result = input;
            if (input.charAt(0) == '.') {
                result = input.substring(1);
            }
            if (result.charAt(result.length() - 1) == '.') {
                result = result.substring(0, result.length() - 1);
            }
            return result;
        } else {
            if(input.equals(".")) return "";
        }
        return input;
    }

    //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    public String fifthStep(String input) {
        if(input.isEmpty()) return "a";
        return input;
    }

    //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    public String sixthStep(String input) {
        String result = input;
        if(input.length() > 15) {
            result = input.substring(0, 15);
            if(result.charAt(result.length() - 1) == '.') {
                result = result.substring(0, 14);
            }
        }
        return result;
    }

    //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    public String seventhStep(String input) {
        String result = input;
        if(input.length() <= 2) {
            while(result.length() < 3) {
                result += result.charAt(input.length() - 1);
            }
        }
        return result;
    }
}
