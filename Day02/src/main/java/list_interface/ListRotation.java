package list_interface;

import java.util.ArrayList;
import java.util.List;

public class ListRotation {

    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;  // Handle cases where k > n
        List<Integer> rotatedList = new ArrayList<>();

        // Add elements from index k to end
        for (int i = k; i < n; i++) {
            rotatedList.add(list.get(i));
        }

        // Add elements from start to index k-1
        for (int i = 0; i < k; i++) {
            rotatedList.add(list.get(i));
        }

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        int rotateBy = 2;

        System.out.println("Original List: " + list);
        List<Integer> rotatedList = rotateList(list, rotateBy);
        System.out.println("Rotated List: " + rotatedList);
    }
}
