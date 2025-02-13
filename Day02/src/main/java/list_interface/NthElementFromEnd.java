package list_interface;

import java.util.LinkedList;

public class NthElementFromEnd {

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        int left = 0;
        int right = n;

        if (n > list.size()) {
            return "N is larger than the size of the list.";
        }

        // Two-pointer approach
        while (right < list.size()) {
            left++;
            right++;
        }

        return list.get(left);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        System.out.println("Original List: " + list);
        System.out.println("Nth Element from End: " + findNthFromEnd(list, n));
    }
}
