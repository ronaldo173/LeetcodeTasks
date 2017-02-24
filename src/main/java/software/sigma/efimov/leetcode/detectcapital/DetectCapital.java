package software.sigma.efimov.leetcode.detectcapital;

/**
 * Created by alexandr.efimov on 2/23/2017.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toLowerCase()) || word.equals(word.toUpperCase())
                || (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()));
    }

    public boolean detectCapitalUseCheckEachLetter(String word) {
        String wordInLowerCase = word.toLowerCase();

        char[] chars = wordInLowerCase.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            char letter = chars[i];
            char originLetter = word.charAt(i);

            if (letter != originLetter) counter++;
        }

        //if 1 difference check that it's first letter capital
        if (counter == 1) {
            return Character.isUpperCase(word.charAt(0));
        }

        if ((counter == 0) || (counter == word.length())) {
            return true;
        }

        return false;
    }
}
