/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 1:34 PM
 */
package set;

import databean.Student;

import java.util.HashSet;
import java.util.Set;

//creating a set to store student objects
public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet =  new HashSet<>();
        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setName("Ramesh");
        Student s2= new Student();
        s2.setRollNo(54);
        s2.setName("vikas");
        Student s3 = new Student();
        s3.setRollNo(11);
        s3.setName("Ramesh");

        //adding above object into set
        System.out.println(studentSet.add(s1));
        System.out.println(studentSet.add(s2));
        System.out.println(studentSet.add(s3));

        //printing set
        System.out.println(studentSet);
    }
}
