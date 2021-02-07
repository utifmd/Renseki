package com.company.main.solutions;

import com.company.main.abstracts.ExampleFramework;

public class ExampleSolution implements ExampleFramework {
    @Override
    public int solution(int[] input) {
        int result = 0;
        for (int value : input) {
            result += value;
        }

        return result;
    }
}
