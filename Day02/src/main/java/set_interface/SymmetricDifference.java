package set_interface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);  // Union of both sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);  // Intersection of both sets
        result.removeAll(intersection);  // Remove intersection from the union
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));  // Output: [1, 2, 4, 5]
    }
}
