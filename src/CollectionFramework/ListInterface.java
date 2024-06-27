package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.get(2));

//         Replaces the element at the specified index
//with the given element.
        list.set(1,100);
        System.out.println(list);

        list.add(3,35);
        System.out.println(list);



    }
}
