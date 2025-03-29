package java_topic_collection_topics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class L2_SET {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.add(5);
        set.add(3);
        set.add(12);
        set.add(12);

        System.out.println(set.size());
        System.out.println(set.isEmpty());

        // print all the elements from set using for each loop
        for(Integer value : set){
            System.out.println(value);
        }

        System.out.println(set);

        // print the elements using iterator
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // Q. Remove duplicate elements from integer array.
        int[] input = {3,2,5,1,2,3};

        Set<Integer> result = new HashSet<>();
        for(int value : input){
            result.add(value);
        }
        System.out.println(result); // [1, 2, 3, 5]

        int[] input1 = {3,2,5,1,2,3};
        Set<Integer> result1 = new LinkedHashSet<>();
        for(int value : input1){
            result1.add(value);
        }
        System.out.println(result1); // [3, 2, 5, 1]

    }
}
