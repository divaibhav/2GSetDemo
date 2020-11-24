/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 1:28 PM
 */
package set;

import java.util.HashSet;
import java.util.Set;

//set operations like union
public class SetDemo1 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> union = new HashSet<>();

        //add elements in s1 and s2
        for (int i = 0; i < 5; i++) {
            s1.add((int)(Math.random() * 100));
            s2.add((int)(Math.random() * 100));
        }
        System.out.println(s1);
        System.out.println(s2);

        //union of s1 and s2
        union.addAll(s1);
        union.addAll(s2);
        System.out.println("union = "  + union);
    }
}
