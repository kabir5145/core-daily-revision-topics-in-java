package com.company;

import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        //question 1
        /*
        HashMap<Integer,String > num = new HashMap<>();
        num.put(1,"kabir");
        num.put(2,"raghav");
        num.put(3,"aaditya");

        for (Map.Entry x : num.entrySet()){
            System.out.println(x.getKey()+"--> "+x.getValue());
        }
         */

        //question 2
        HashMap<Integer,String > siz = new HashMap<Integer,String>();
        siz.put(1,"hello");
        siz.put(2,"good");
        siz.put(3,"bad");
        siz.put(4,"sad");

            System.out.println(siz.size());
    }
}
