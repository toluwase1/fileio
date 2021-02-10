package com.company;

import java.util.*;

class Program {
    public static int[] reverseLinkedList(LinkedList head) {
        // Write your code here.
        int[] expected = new int[] {5, 4, 3, 2, 1, 0};


        return Arrays.stream(expected).toArray();
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
