package com.prowings.collection.map;

import java.util.HashSet;
import java.util.Hashtable;

public class HashTableDebugViewDemo {

    public static void main(String[] args) {

        Hashtable<String, Integer> ht = new Hashtable<>();

        System.out.println(ht.put("AAA", 123));
        System.out.println(ht.put("BBB", 234));
        System.out.println(ht.put("ZZZ", 678));
        System.out.println(ht.put("WWW", 678));
        System.out.println(ht.put("SSS", 678));
        System.out.println(ht.put("DDD", 678));
        System.out.println(ht.put("NNN", 678));
        System.out.println(ht.put("QQQ", 678));
        System.out.println(ht.put("TTT", 678));

        System.out.println(ht.put("TT1", 678));
        System.out.println(ht.put("TT2", 678));
        System.out.println(ht.put("TT3", 678));
        System.out.println(ht.put("TT4", 678));
        System.out.println(ht.put("TT5", 678));
        System.out.println(ht.put("TT6", 678));
        System.out.println(ht.put("TT7", 678));
        System.out.println(ht.put("TT8", 678));
        System.out.println(ht.put("TT9", 678));


        System.out.println(ht.get("AAA"));

        System.out.println("size === "+ht.size());
        System.out.println("isEmpty === "+ht.isEmpty());

        System.out.println(ht);
    }


}
