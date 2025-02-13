package list_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Frequency {

    public static  Map<String,Integer> frequency(List<String> data){
        Map<String,Integer> res= new HashMap<>();

        for (String str : data) {
            res.put(str, res.getOrDefault(str, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        List<String> data = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> frequencyMap = frequency(data);
        System.out.println(frequencyMap);
    }
}