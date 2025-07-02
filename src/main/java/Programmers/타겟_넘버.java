package Programmers;

public class 타겟_넘버 {
    public int solution(int[] numbers, int target) {
        return backtrack(numbers, target, 0, 0);
    }

    public int backtrack(int[] numbers, int target, int sum, int idx) {
        int count = 0;
        if(idx == numbers.length) {
            return (sum == target) ? 1 : 0;
        }
        count += backtrack(numbers, target, sum + numbers[idx], idx + 1);
        count += backtrack(numbers, target, sum - numbers[idx], idx + 1);
        return count;
    }
}
