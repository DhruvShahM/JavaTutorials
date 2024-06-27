package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(200));

        // remove the array element using index
        list.remove(1);
        System.out.println(list);

        //remove the array element using value
        list.remove(Integer.valueOf(40));
        System.out.println(list);

        //addall methods to add all the elements
        list2.addAll(list);
        System.out.println(list2);

        // Removes all elements in the
        //collection that are also contained in the specified collection.
//        list2.removeAll(list);
//        System.out.println(list2);

        list.add(10);
        list.add(80);
        list.add(90);
        list.add(40);
        list.add(50);

        // Removes all elements from the
        //collection that are not present in the specified collection.
        list2.retainAll(list);
        System.out.println(list2);


//        clear all the elements
//        list2.clear();
//        System.out.println(list2);

//            list to array convert
        Object a[]=list.toArray();
        for (Object e: a){
            Integer temp=(Integer) e;
            System.out.println();
        }

    }
}
