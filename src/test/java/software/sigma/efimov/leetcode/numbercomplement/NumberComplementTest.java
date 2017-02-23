package software.sigma.efimov.leetcode.numbercomplement;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandr.efimov on 2/10/2017.
 */
public class NumberComplementTest {
    private NumberComplement numberComplement = new NumberComplement();

    @Test
    public void testComplementShouldBe2() {
        int complement = numberComplement.findComplement(5);
        Assert.assertEquals(2, complement);
    }

    @Test
    public void testComplementShouldBe0() {
        int complement = numberComplement.findComplement(0);
        Assert.assertEquals(1, complement);
    }

    @Test
    public void testComplementShouldBe1() {
        int complement = numberComplement.findComplement(1);
        Assert.assertEquals(0, complement);
    }

}