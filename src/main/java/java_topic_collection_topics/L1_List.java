package java_topic_collection_topics;

import java.util.*;

public class L1_List {
    public static void main(String[] args) {

        //List list = new List(); // List is abstract; cannot be instantiated

       /* List lst = new ArrayList();
        List lst1 = new Stack();
        List lst2 = new LinkedList();
   */
//        int[] arr = new int[5];
//        arr[0] = 2.5f;
        //System.out.println();

//        ArrayList list = new ArrayList();
//        System.out.println(list.size());
//        System.out.println(list);
//        list.add("preety");
//        list.add(123);
//        list.add(12.5);
//        list.add(true);
//        list.add('a');
//        System.out.println(list);

        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println(arrList.isEmpty());
        arrList.add(90);
        arrList.add(15);
        arrList.add(30);
        arrList.add(40);
        arrList.add(60);
        arrList.add(60);
        arrList.add(70);
        System.out.println(arrList);
        System.out.println(arrList.isEmpty());
        System.out.println(arrList.size());

        // print the specific element from the list
        System.out.println("Element at index 2: "+arrList.get(2));
        System.out.println("last element present in list: "+arrList.get(arrList.size()-1));

        // print all the elements from the list
        for(Integer value: arrList){
            System.out.println(value);
        }

        //Q.  print all the elements from the list using indexed for loop


        System.out.println("Before Removing index 2 item : "+arrList);
        arrList.remove(2);
        System.out.println("After Removing index 2 item : "+arrList);

        // sort the list in ASC order
        System.out.println("Before sorting : "+arrList);
        Collections.sort(arrList);
        System.out.println("After sorting : "+arrList);

    }
}
