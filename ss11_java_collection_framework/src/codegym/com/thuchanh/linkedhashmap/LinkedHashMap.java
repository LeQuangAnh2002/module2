package codegym.com.thuchanh.linkedhashmap;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
       Student student1 = new Student(1, "Bao");
       Student student2 = new Student(2, "Hung");
       Student student3 = new Student(3, "Hào");
       Student student4 = new Student(4, "Nam");

       Map<Integer,Student> map = new HashMap<>();
       map.put(student1.getId(), student1);
       map.put(student2.getId(), student2);
       map.put(student3.getId(), student3);
       map.put(student4.getId(), student4);
        // show map using method keySet();
       for (Integer key: map.keySet()){
           Student value = map.get(key);
           System.out.println(key + " = "+ value);
       }
        System.out.println("---");
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
