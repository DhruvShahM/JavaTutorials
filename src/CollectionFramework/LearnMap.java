package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,String> list=new HashMap();

        list.put("us","United States");
        list.put("in","India");
        list.putIfAbsent("in","India2");

//        list.remove("us");

        System.out.println(list);

        System.out.println(list.containsKey("de"));


        System.out.println(list.get("in"));


        Map<String,String> list2=new HashMap();

        list2.putAll(list);

        System.out.println(list2);

        System.out.println(list2.getOrDefault("en","Others"));


        Set<String> keys=list.keySet();

        System.out.println(keys);
    }
}
