package software.sigma.efimov.leetcode.nextgreaterelement;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alexandr.efimov on 2/10/2017.
 */
public class NextGreaterElementITest {
    private NextGreaterElementI nextGreaterElement = new NextGreaterElementI();

    @Test
    public void testNextGreaterElement() {
        int[] result = nextGreaterElement.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
        Assert.assertArrayEquals(new int[]{-1, 3, -1}, result);
    }

    @Test
    public void testNextGreaterElement2() {
        int[] result = nextGreaterElement.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
        Assert.assertArrayEquals(new int[]{3, -1}, result);
    }

    @Test
    public void testNextGreaterElement3() {
        int[] result = nextGreaterElement.nextGreaterElement(new int[]{3, 1, 5, 7, 9, 2, 6}, new int[]{1, 2, 3, 5, 6, 7, 9, 11});
        Assert.assertArrayEquals(new int[]{5, 2, 6, 9, 11, 3, 7}, result);
    }

    @Test
    public void testNextGreaterElementShouldNotFindElements() {
        int[] result = nextGreaterElement.nextGreaterElement(new int[]{9, 8, 7}, new int[]{1, 2, 3, 5});
        Assert.assertArrayEquals(new int[]{-1, -1, -1}, result);
    }
}