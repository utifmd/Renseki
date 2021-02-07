package com.company.main.solutions;

import com.company.main.abstracts.ExampleFramework;
import com.company.main.abstracts.test.Solution1Framework;

public class Solution1Solution implements Solution1Framework {

    @Override
    public int solution(IntList input) {
        int result = 0;
        if(input.next != null) {
            result = input.next.value;
        }

        return result;
    }
}
