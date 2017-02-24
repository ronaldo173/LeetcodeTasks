package software.sigma.efimov.leetcode.singlenumber;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * <p>
 * Created by alexandr.efimov on 2/24/2017.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        return iterator.hasNext() ? iterator.next() : 0;
    }
}
