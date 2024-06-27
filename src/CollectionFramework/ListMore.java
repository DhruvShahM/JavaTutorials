package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListMore {

    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banna");


        for(int i=0;i<fruits.size();i++){
            System.out.println("Fruits is "+fruits.get(i));
        }

//        iterator working as a for loop
        Iterator<String> it= fruits.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }

        // subList to extarct the string from the certain indexes
        List<String> ie= fruits.subList(0,2);
        System.out.println("iterator "+ie);


        Stack<String> fruitsStack=new Stack<>();
        fruitsStack.add("Kiwi");
        fruitsStack.add("Apple");
        fruitsStack.add("Mango");
        fruitsStack.add("Banna");

        System.out.println(fruitsStack.pop());
        System.out.println(fruitsStack);
        System.out.println(fruitsStack.peek());
        System.out.println(fruitsStack.empty());

    }

}
