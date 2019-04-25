package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        String current;
        int count = 0; // count of redundant elements
        for (int i = 0; i < array.length - count; i++) {
            current = array[i];
            for (int j = i + 1; j < array.length - count; j++) {
                if (array[j].equals(current)) {
                    array[j] = array[array.length - count - 1];
                    count++;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, array.length - count);
    }
}
