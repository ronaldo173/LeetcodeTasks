package software.sigma.efimov.leetcode.nextgreaterelement;

/**
 * Task description:
 * <p>
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
 * <p>
 * Example:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
 * Output: [-1,3,-1]
 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];

        for (int i = 0; i < findNums.length; i++) {
            int num = findNums[i];
            res[i] = getNextGreater(num, nums);
        }
        return res;
    }

    private int getNextGreater(int num, int[] nums) {
        int res = -1;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int valInArr = nums[i];
            if (valInArr == num) {

                for (int j = i; j < length; j++) {
                    if (nums[j] > valInArr) {
                        return nums[j];
                    }
                }
                return res;
            }
        }
        return res;
    }
}
