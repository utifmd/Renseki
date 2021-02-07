package com.company.main.solutions;

import com.company.main.abstracts.test.Solution2Framework;

import java.util.ArrayList;
import java.util.List;

public class Solution2Solution implements Solution2Framework {
    @Override
    public int solution(Integer[] A) {
        List<Integer> integerList = new ArrayList<>();
        int summary = 0;
        int counter = 0;

        for (int i=0; i < A.length/2; i++){ /* ~> jumlah element dibagi 2 untuk dilipat */ counter++;
            if (A.length % 2 == 0){ // ~> memastikan jumlah element genap dan sebaliknya
                integerList.add((A[i] + A[A.length-counter]) % 10); // ~> melipat element awal vs akir, 2 awal vs 2 akir dst..
            }else {
                integerList.add((A[i]) % 10);
            }
        }

        for (Integer item: integerList){
            summary += item;
        }

        return summary;
    }
}
