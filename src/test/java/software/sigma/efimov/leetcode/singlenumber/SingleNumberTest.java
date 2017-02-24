package software.sigma.efimov.leetcode.singlenumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandr.efimov on 2/24/2017.
 */
public class SingleNumberTest {
    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumberShouldGet1() throws Exception {
        int result = singleNumber.singleNumber(new int[]{1, 2, 3, 4, 5, 2, 4, 3, 5});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSingleNumberShouldGet0NoSingleElement() throws Exception {
        int result = singleNumber.singleNumber(new int[]{1, 2, 3, 4, 5, 2, 4, 3, 5, 1});
        Assert.assertEquals(0, result);
    }

}