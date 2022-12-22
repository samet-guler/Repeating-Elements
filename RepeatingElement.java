package collectionspractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatingElement {

    public static void main(String[] args) {

    findRepeatingElement();

    }
    public static void findRepeatingElement() {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);
        myList.add(13);
        HashSet<Integer> hashSet = new HashSet<>(myList);
        if (myList.size() == hashSet.size()) {
            System.out.println("There are no repeating elements.");
        }else {
            System.out.println("There are repeating elements.");
        }
    }
}
