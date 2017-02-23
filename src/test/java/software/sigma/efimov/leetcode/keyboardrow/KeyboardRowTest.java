package software.sigma.efimov.leetcode.keyboardrow;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by alexandr.efimov on 2/10/2017.
 */
public class KeyboardRowTest {
    private KeyboardRow keyboardRow = new KeyboardRow();


    @Test
    public void testFindWords() throws Exception {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] wordsAfterFiltering = keyboardRow.findWords(words);
        System.out.println("result: " + Arrays.toString(wordsAfterFiltering));

        Assert.assertArrayEquals(new String[]{"Alaska", "Dad"}, wordsAfterFiltering);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindWordsWrongSymbol() throws Exception {
        String[] words = {"][", "Alaska", "Dad", "Peace"};
        keyboardRow.findWords(words);
    }

}