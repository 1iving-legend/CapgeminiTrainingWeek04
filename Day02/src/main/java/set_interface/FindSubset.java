package set_interface;

import java.util.HashSet;
import java.util.Set;

public class FindSubset {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);  // Check if all elements of set1 are in set2
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Is set1 a subset of set2? " + isSubset(set1, set2));  // Output: true
    }
}
