package set_interface;

import java.util.*;

public class SortedList {

    public static List<Integer> setToSortedList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);  // Sort the list in ascending order
        return list;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        System.out.println("Sorted List: " + setToSortedList(set));  // Output: [1, 3, 5, 9]
    }
}
