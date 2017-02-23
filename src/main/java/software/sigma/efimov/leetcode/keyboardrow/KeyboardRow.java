package software.sigma.efimov.leetcode.keyboardrow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandr.efimov on 2/9/2017.
 */
public class KeyboardRow {

    private static final String firstRow = "qwertyuiop";
    private static final String secondRow = "asdfghjkl";
    private static final String thirdRow = "zxcvbnm";


    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (isLettersFromOneRow(word.toLowerCase())) {
                list.add(word);
            }
        }
        return list.toArray(new String[list.size()]);
    }

    private boolean isLettersFromOneRow(String word) {

        String row = getRowByFirstWordLetter(word.charAt(0));
        for (char c : word.toCharArray()) {
            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }

    private String getRowByFirstWordLetter(char c) {

        String[] all = {firstRow, secondRow, thirdRow};
        for (String row : all) {
            if (row.contains(String.valueOf(c))) {
                return row;
            }
        }
        throw new IllegalArgumentException();
    }
}
