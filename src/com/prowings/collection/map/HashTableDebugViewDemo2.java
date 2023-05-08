package com.prowings.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDebugViewDemo2 {

    public static void main(String[] args) {

        Hashtable<String, Integer> ht = new Hashtable<>();

        System.out.println(ht.put("AAA", 123));
        System.out.println(ht.put("BBB", 234));
        System.out.println(ht.put("CCC", 234));
        System.out.println(ht.put("DDD", 234));
        System.out.println(ht.put("AAA", 345));
//        System.out.println(ht.put("FFF", null)); //null value not allowed
//        System.out.println(ht.put(null, 234));   //null key not allowed

        System.out.println(ht.remove("AAA"));

        System.out.println(">>>>> keys : enumeration ");
        Enumeration emr = ht.keys();

        while (emr.hasMoreElements())
        {
            System.out.println(emr.nextElement());
        }

        System.out.println(">>>>>>>>>> elements : enumeration");
        Enumeration emr1 = ht.elements();

        while (emr1.hasMoreElements())
        {
            System.out.println(emr1.nextElement());
        }

        System.out.println(ht);
    }


}
