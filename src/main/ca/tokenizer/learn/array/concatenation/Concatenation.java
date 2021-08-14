package ca.tokenizer.learn.array.concatenation;

import java.util.stream.IntStream;

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
 * ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, `ans` is the concatenation of two nums arrays.
 * <p>
 * Return the array `ans`.
 */
class Concatenation {

    public int[] getConcatenation1(int[] nums) {
        int[] ans = new int[nums.length * 2];
        IntStream
                .range(0, nums.length).forEach(i -> ans[i + nums.length] = ans[i] = nums[i]);
        return ans;
    }

    public int[] getConcatenation2(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = ans[i] = nums[i];
        }
        return ans;
    }

    public int[] getConcatenation3(int[] nums) {
        int[] ans = new int[nums.length * 2];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }

}
