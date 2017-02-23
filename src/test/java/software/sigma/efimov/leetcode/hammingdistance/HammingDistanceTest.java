package software.sigma.efimov.leetcode.hammingdistance;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandr.efimov on 2/10/2017.
 */
public class HammingDistanceTest {
    private HammingDistance hammingDistance = new HammingDistance();


    @Test
    public void hammingDistanceShouldBe2() throws Exception {
        int hammingDistanceResult = hammingDistance.hammingDistance(1, 4);
        Assert.assertEquals(2, hammingDistanceResult);

    }

    @Test
    public void hammingDistanceShouldBe4() throws Exception {
        int hammingDistanceResult = hammingDistance.hammingDistance(10, 5);
        Assert.assertEquals(4, hammingDistanceResult);

    }

}