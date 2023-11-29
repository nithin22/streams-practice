package com.begginer.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapExample {

    public static void main(String[] args) {
        TreeMap<String,Double>tmap= new TreeMap<String,Double>(new Tcomp());
        tmap.put("Venkat zithin",new Double(34567.90));
        tmap.put("Nithih Venkat",new Double(34567.90));
        tmap.put("Atturu Nani",new Double(34567.90));
        tmap.put("Venkat Nithin",new Double(34567.90));

        Set<Map.Entry<String,Double>> set=tmap.entrySet();

        for (Map.Entry<String,Double> result:
             set) {
            System.out.println(result);
        }

    }
}
