package com.bootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Competition 
{
    public static Map<Integer, String> suffixes() {
        Map<Integer, String> suffixMap = new HashMap<Integer, String>();
        suffixMap.put(0, "th");
        suffixMap.put(1, "st");
        suffixMap.put(2, "nd");
        suffixMap.put(3, "rd");
        for (int i = 4; i < 14; i++){
            suffixMap.put(i, "th");
        }
        return suffixMap;
    }
        

    public static List<String> removePosition(int pos)
    {
        List<String> allPositions = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (i != pos){
                allPositions.add(i + (suffixes().containsKey(i) ? suffixes().get(i) : suffixes().get(Integer.parseInt(String.valueOf(i).substring(String.valueOf(i).length() - 1)))));
            }
 
        }
        System.out.println( "Hello World!" );
        return allPositions;
    }
}
