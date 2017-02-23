package software.sigma.efimov.leetcode.addstrings;

/**
 * Created by alexandr.efimov on 2/6/2017.
 */
public class AddStrings {


    public static String addStrings(String num1, String num2) {
        String sum;
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();

        if (chars1.length > chars2.length) {
            sum = sumDigits(chars2, chars1);
        } else {
            sum = sumDigits(chars1, chars2);
        }

        return sum;
    }

    private static String sumDigits(char[] shorter, char[] longer) {

        StringBuilder res = new StringBuilder();
        int lengthShorter = shorter.length;
        int buffer = 0;

        for (int i = longer.length - 1, j = 1; i >= 0; i--, j++) {
            int longerVal = Character.getNumericValue(longer[i]);
            int shorterVal = getFromArray(shorter, lengthShorter - j);

            int sum = longerVal + shorterVal + buffer;

            if (sum > 9) {
                buffer = 1;
            } else {
                buffer = 0;
            }
            res.insert(0, sum % 10);

        }
        if (buffer == 1) res.insert(0, 1);

        return res.toString();
    }

    private static int getFromArray(char[] shorter, int j) {
        if (j < 0) {
            return 0;
        } else {
            return Character.getNumericValue(shorter[j]);
        }
    }
}
