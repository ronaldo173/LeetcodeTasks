package software.sigma.efimov.leetcode;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by alexandr.efimov on 2/10/2017.
 */
public class MainTestSmth {

    public static void main(String[] args) {
        Path path = Paths.get("a", "b", "ce");
        System.out.println(path.endsWith(Paths.get("b", "c")));

        List<String> collection = new ArrayList<>();
        collection.add("first");
        collection.add("second");

        System.out.println(collection);

        collection.remove(1);
        System.out.println(collection);

        System.out.println("---");
        execute(new String[]{"123", "456"});
        execute(new Integer[]{1, 2});
        System.out.println(Arrays.asList(String.valueOf("sad")));

    }

    static void execute(String... aa) {
        System.out.println(Arrays.toString(aa));
    }

    static void execute(Object... aa) {
        System.out.println(Arrays.toString(aa));
    }
}
