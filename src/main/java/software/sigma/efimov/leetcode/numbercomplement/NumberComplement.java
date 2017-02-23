package software.sigma.efimov.leetcode.numbercomplement;

/**
 * Created by alexandr.efimov on 2/9/2017.
 */
public class NumberComplement {

    public int findComplement(int num) {

        String binaryString = Integer.toBinaryString(num);
        StringBuilder builder = new StringBuilder();
        for (char c : binaryString.toCharArray()) {
            if (Character.getNumericValue(c) == 1) {
                builder.append(0);
            } else {
                builder.append(1);
            }
        }

        return Integer.parseInt(builder.toString(), 2);
    }
}
