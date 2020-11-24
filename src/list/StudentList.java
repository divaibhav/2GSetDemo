/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 1:43 PM
 */
package list;

import databean.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//creating an ArrayList of student object
public class StudentList {
    public static void main(String[] args) {
        List<Student>studentList = new ArrayList<>();
        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setName("Ramesh");
        Student s2= new Student();
        s2.setRollNo(54);
        s2.setName("vikas");
        Student s3 = new Student();
        s3.setRollNo(11);
        s3.setName("Ramesh");

        System.out.println(studentList.add(s1));
        System.out.println(studentList.add(s2));
        System.out.println(studentList.add(s3));

        System.out.println(studentList);

        //now i want you to arrange this list as per rollNo;
        Collections.sort(studentList);//student class must implements Comparable
        System.out.println("sorted");
        System.out.println(studentList);
        
    }
}
