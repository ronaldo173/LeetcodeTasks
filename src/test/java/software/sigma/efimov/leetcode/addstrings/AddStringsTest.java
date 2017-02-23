package software.sigma.efimov.leetcode.addstrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandr.efimov on 2/10/2017.
 */
public class AddStringsTest {
    AddStrings addStrings = new AddStrings();

    @Test
    public void addStrings1() throws Exception {
        String result = addStrings.addStrings("71103343", "6913259244");
        Assert.assertEquals("6984362587", result);
    }

    @Test
    public void addStrings2() throws Exception {
        String result = addStrings.addStrings("9871", "9871");
        Assert.assertEquals("19742", result);
    }

    @Test
    public void addStrings3() throws Exception {
        String result = addStrings.addStrings("9871", "56789");
        Assert.assertEquals("66660", result);
    }

    @Test
    public void addStrings4() throws Exception {
        String result = addStrings.addStrings("1", "9");
        Assert.assertEquals("10", result);
    }

    @Test
    public void addStrings5() throws Exception {
        String result = addStrings.addStrings("99999", "1");
        Assert.assertEquals("100000", result);
    }

}