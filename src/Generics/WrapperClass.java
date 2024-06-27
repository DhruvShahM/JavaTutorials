package Generics;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {
        Integer obj=new Integer(12);
        Dog<String,String> d1=new Dog<>("abcd123","abc");
        Dog<String,String> d2=new Dog<>("abcd12","xyz");

        Dog<Integer,String> d3=new Dog<>(123,"Demo");

        ArrayList<Integer> nwArList=new ArrayList<>();

        System.out.println(d1.id);
        System.out.println(d3.id);

        System.out.println(d3.getId());
    }
}

class Dog<E,V>{
    E id;

    V name;

    public Dog(E id,V name){
       this.id=id;
       this.name=name;
    }

    E getId(){
     return id;
    }
}
