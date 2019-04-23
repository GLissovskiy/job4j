package ru.job4j.array;

/**
 * Reverse array
 *
 * @author glissovskiy (leginBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {

    /**
     * Method reverse your array.
     * @param array Your array.
     * @return Reversed array.
     */
    public int[] back(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
