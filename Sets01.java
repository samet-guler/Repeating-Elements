package collectionspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets01 {

    public static void main(String[] args) {

        System.out.println(hashSet());
    }
    public static Set hashSet() {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(15);
        list.add(7);
        list.add(13);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(7);
        set.add(35);
        set.add(13);
        set.removeAll(list);

        return set;
    }
}
