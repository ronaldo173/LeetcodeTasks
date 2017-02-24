package software.sigma.efimov.leetcode.detectcapital;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandr.efimov on 2/23/2017.
 */
public class DetectCapitalTest {
    private DetectCapital detectCapital = new DetectCapital();

    @Test
    public void testDetectCapitalUseAllCapitals() throws Exception {
        boolean isCorrect = detectCapital.detectCapitalUse("USA");
        Assert.assertTrue(isCorrect);
    }

    @Test
    public void testDetectCapitalUseAllLowCase() throws Exception {
        boolean isCorrect = detectCapital.detectCapitalUse("usa");
        Assert.assertTrue(isCorrect);
    }

    @Test
    public void testDetectCapitalShouldBeNotValidMultipleCapital() throws Exception {
        boolean isCorrect = detectCapital.detectCapitalUse("FlaG");
        Assert.assertFalse(isCorrect);
    }

    @Test
    public void testDetectCapitalShouldBeNotValidNotFirstCapital() throws Exception {
        boolean isCorrect = detectCapital.detectCapitalUse("flaG");
        Assert.assertFalse(isCorrect);
    }

    @Test
    public void testDetectCapitalShouldBeValid() throws Exception {
        boolean isCorrect = detectCapital.detectCapitalUse("Flag");
        Assert.assertTrue(isCorrect);
    }

}