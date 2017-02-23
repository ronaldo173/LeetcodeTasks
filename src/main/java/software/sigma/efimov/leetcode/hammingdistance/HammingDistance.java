package software.sigma.efimov.leetcode.hammingdistance;

/**
 * Created by alexandr.efimov on 2/7/2017.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int difference = 0;

        StringBuilder binaryX = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder binaryY = new StringBuilder(Integer.toBinaryString(y));

        int maxLength = Integer.max(binaryX.length(), binaryY.length());
        addZeros(binaryX, binaryY, maxLength);

        for (int i = 0; i < maxLength; i++) {
            if (binaryX.charAt(i) != binaryY.charAt(i)) difference++;
        }

        return difference;
    }

    private void addZeros(StringBuilder binaryX, StringBuilder binaryY, int maxLength) {
        int addZerosFirst = maxLength - binaryX.length();
        int addZerosSecond = maxLength - binaryY.length();

        for (int i = 0; i < addZerosFirst; i++) {
            binaryX.insert(0, 0);
        }

        for (int i = 0; i < addZerosSecond; i++) {
            binaryY.insert(0, 0);
        }
    }
}
