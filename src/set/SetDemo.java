/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 1:07 PM
 */
package set;

import java.util.*;

/**
 * Creating a set which hold integer objects. and will explore
 * some methods of hashset class
 */
public class SetDemo {
    public static void main(String[] args) {
        //create a set
        Set<Integer> set = new HashSet<>();// capacity = 16 & load factor = 0.75

        //adding elements
        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(5));
        System.out.println(set.add(18));
        System.out.println(set.add(53));
        //trying to add duplicate
        System.out.println(set.add(10));
        //printing set
        System.out.println(set);

        //traverse
        //using for each
        // sum of all the elements of set
        int sum = 0;
        for(Integer element : set){
            sum = sum + element;
            System.out.print(element + ", ");
        }
        System.out.println();
        System.out.println("sum = " + sum);
        System.out.println("using iterator");
        //using iterator
        //i have to get iterator on set
        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
        //use addAll

        //creating arraylist
        List<Integer> list = new ArrayList<>();
        //initailize it by random values
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println("list = " + list);

        //adding all the elements of list into set
        set.addAll(list);

        System.out.println("set = " + set);

        //remove
        System.out.println(set.remove(1234));
        System.out.println(set.remove(53));
        System.out.println("set = " + set);

        //there is direct method to convert your set into array
        Object[]  arr = set.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
