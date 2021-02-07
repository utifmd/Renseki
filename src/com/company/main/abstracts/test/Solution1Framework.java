package com.company.main.abstracts.test;

import java.awt.*;

/**
 * @author Erick Pranata
 * @since 2019-06-24
 */
public interface Solution1Framework {
    class IntList{
        public int value;
        public IntList next;

        public IntList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    int solution(IntList input);
}
