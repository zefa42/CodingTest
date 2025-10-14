package Leetcode;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] elements = new int[2];
        OUTER:
        for(int i = 0; i < nums.length - 1; ++i) {
            for(int j = i + 1; j < nums.length; ++j) {
                if(target == nums[i] + nums[j]) {
                    elements[0] = i;
                    elements[1] = j;
                    break OUTER;
                }
            }
        }
        return elements;
    }
}
