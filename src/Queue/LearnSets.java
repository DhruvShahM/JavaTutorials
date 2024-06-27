package Queue;

import java.util.*;

class Student{
    Integer rollNo;

    String name;

    public Student(Integer rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNo, student.rollNo) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}

public class LearnSets {

    enum Color{
        RED,YELLOW,GREEN
    }

    public static void main(String[] args) {
//        Set<Integer> set=new LinkedHashSet<>();//O(1)
//        Set<Integer> set=new TreeSet<>();//O(n)
        Set<String> set=new HashSet<>();//O(logn)
//        set.add(10);
//        set.add(30);
//        set.add(40);
//        set.add(40);
//        set.add(60);
//        set.add(20);
//        set.add(20);
//
//        set.remove(10);

        set.add("Dhruv");
        set.add("monal");
        set.add("Deep");


        Set<Student> students=new HashSet<>();
        students.add(new Student(1,"Dhruv"));
        students.add(new Student(1,"Dhruv"));
        students.add(new Student(1,"Dhruv"));
        System.out.println(students);

        EnumSet<Color> enumSet=EnumSet.allOf(Color.class);
        System.out.println(enumSet);
    }
}
