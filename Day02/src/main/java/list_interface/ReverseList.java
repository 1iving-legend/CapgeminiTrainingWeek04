package list_interface;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static <T> void reverse(List<T> l) {
        List<T> temp = new ArrayList<>(l.size());
        for (int i = l.size() - 1; i >= 0; i--) {
            temp.add(l.get(i));
        }
        l.clear();
        l.addAll(temp);
    }

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);

        System.out.println("Before reverse: " + data);
        reverse(data);
        System.out.println("After reverse: " + data);
    }
}
