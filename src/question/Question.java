/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Nov-20
 *  Time: 1:15 PM
 */
package question;

import databean.Student;


import java.util.*;

/**
 * Question: Create a list of Student object, add 5 elements in the list.
 * Sort it on the basis of first on rollNo,
 * then by Name;
 * Student class contains two fields rollNo & Name;
 * hint: Comparable<T></> and Comparator<T> with lambda expression
 */
class Student1 implements Comparable<Student1>, Comparator<Student1>{
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return this.getRollNo() - o.getRollNo();
    }

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student1> list =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student1 s = new Student1();
            s.setName(sc.nextLine());
            s.setRollNo(sc.nextInt());
            sc.nextLine();
        }
        Collections.sort(list);//sorting by roll no
        System.out.println(list);
        //lambda expression for Comparator
        Comparator<Student1> comparator = (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(list,comparator);//sorting by name
        System.out.println(list);


    }
}
