package software.sigma.efimov.leetcode.spiralmatrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by alexandr.efimov on 2/23/2017.
 */
public class SpiralMatrixTest {
    @Test
    public void spiralOrder4x4() throws Exception {
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        int[][] array = new int[][]{
                {1, 2, 3, 11}
                , {1, 2, 3, 12}
                , {4, 5, 6, 13}
                , {7, 8, 9, 14}};


        List<Integer> result = spiralMatrix.spiralOrder(array);
        Integer expected[] = {1, 2, 3, 11, 12, 13, 14, 9, 8, 7, 4, 1, 2, 3, 6, 5};
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(expected));
        Assert.assertEquals(expectedList, result);
    }

    @Test
    public void spiralOrder3x3() throws Exception {
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        int[][] array = new int[][]{
                {1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}};


        List<Integer> result = spiralMatrix.spiralOrder(array);
        Integer expected[] = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        ArrayList<Integer> expectedList = new ArrayList<>(Arrays.asList(expected));
        Assert.assertEquals(expectedList, result);
    }

}