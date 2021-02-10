package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {


    public static String nthRank(String st, Integer[] we, int n) {
        List list = new ArrayList<>();
        Map map = new HashMap();
        String [] arr = st.split(",");
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=0; j<arr[i].length(); j++){
                sum += arr[i].charAt(j)-96+arr[i].length();
            }

            list.add(sum* we[i]);
            map.put(sum* we[i],arr[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(st);
        System.out.println(list);

        System.out.println(map);
        int val = (int) list.get(n-1);
        System.out.println(val);
        System.out.println(map.get(val));
     //   return map.get(list.get(n)).toString();
        return (String) map.get(val);


    }
    public static void main(String[] args) {
        String st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        Integer [] we = new Integer[] {1, 3, 5, 5, 3, 6};
        System.out.println(nthRank(st, we, 2));
    }

}
