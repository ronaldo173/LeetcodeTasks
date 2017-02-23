package software.sigma.efimov.leetcode.SumofTwoIntegers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandr.efimov on 2/10/2017.
 */
public class SumOfTwoIntegersTest {

    @Test
    public void testGetSumShouldBe3() {
        int sum = new SumOfTwoIntegers().getSum(1, 2);
        Assert.assertEquals(3, sum);
    }


}