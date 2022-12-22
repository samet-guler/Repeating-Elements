package collectionspractice;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        System.out.println(cont());

    }
    public static TreeSet cont() {
        String s = "Mississippi";
        String[] arr = s.split("");
        HashSet<String> set = new HashSet<>(List.of(arr));
        TreeSet<String> trSet = new TreeSet<>(set);
        return trSet;
    }

}
