package com.company.main.solutions;

import com.company.main.abstracts.test.Solution3Framework;

import java.lang.reflect.Array;
import java.util.*;

public class Solution3Solution implements Solution3Framework {
    @Override
    public int solution(Integer[] input) {
        HashMap<Integer, Integer> elementMap = new HashMap<>();
        int key = 0, max = 0;

        for (Integer element: input){
            if (elementMap.containsKey(element)){
                elementMap.put(element, elementMap.get(element) + 1);
            }else {
                elementMap.put(element, 1);
            }
        }

        for (Map.Entry mapItem: elementMap.entrySet()){
            if ((int) mapItem.getValue() > max){
                max = (int) mapItem.getValue();
                key = (int) mapItem.getKey();
            }
        } //System.out.println("key: "+key+"\nDuplicate times: "+max+"x");

        return key;
    }
}
