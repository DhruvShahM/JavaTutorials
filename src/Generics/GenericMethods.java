package Generics;

public class GenericMethods {

    public static void main(String[] args) {
        printMethod("Hello World");
        System.out.println(123);

        GenericMethods obj=new GenericMethods();
        obj.doubleData("112");
        obj.doubleData(123);

        CustomClass customClass=new CustomClass();
        obj.doubleData(customClass);
    }

    static <E> void printMethod(E msg){
        System.out.println(msg);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }

//    <E extends Number> void doubleData(E data){
//        System.out.println(data);
//    }
}


class CustomClass{

}


