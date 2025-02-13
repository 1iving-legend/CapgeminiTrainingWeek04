package list_interface;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();  // Preserves order
        seen.addAll(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 1, 2, 2, 3, 4);

        System.out.println("Original List: " + list);
        List<Integer> result = removeDuplicates(list);
        System.out.println("List without duplicates: " + result);
    }
}
