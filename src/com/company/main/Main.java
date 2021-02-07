package com.company.main;

import com.company.main.abstracts.ExampleFramework;
import com.company.main.abstracts.test.Solution1Framework;
import com.company.main.abstracts.test.Solution2Framework;
import com.company.main.abstracts.test.Solution3Framework;
import com.company.main.solutions.ExampleSolution;
import com.company.main.solutions.Solution1Solution;
import com.company.main.solutions.Solution2Solution;
import com.company.main.solutions.Solution3Solution;

public class Main {

    public static void main(String[] args) {
        ExampleFramework exampleSolution = new ExampleSolution();
        int[] exampleInput = new int[] { 2, 6, 3, 6, 8 };
        int exampleOutput = exampleSolution.solution(exampleInput);
        System.out.println("Example Solution: " + exampleOutput);

        Solution1Framework solution1 = new Solution1Solution();
        Solution1Framework.IntList solution1Input = new Solution1Framework.IntList(0);
        solution1Input.next = new Solution1Framework.IntList(4);
        int solution1Output = solution1.solution(solution1Input);
        System.out.println("Solution 1: " + solution1Output);

        Solution2Framework solution2 = new Solution2Solution();
        Integer[] solution2Input =
//                new Integer[]{0, 5, 3, 2, -1, 6};
                new Integer[]{0, 5, 3, 8, -1};
        int solution2Output = solution2.solution(solution2Input);
        System.out.println("Solution 2: " + solution2Output);

        Solution3Framework solution3 = new Solution3Solution();
        Integer[] solution3Input =
//                 new Integer[]{2, -4, -4, -4, 9}; // -4
//                 new Integer[]{-2, -2, 9, 9, 9, 7}; // 9
                new Integer[]{-2, -2, -2, 9, 9, 9, -2, 7, 9}; // -2
        int solution3Output = solution3.solution(solution3Input);
        System.out.println("Solution 3: " + solution3Output);
    }
}
