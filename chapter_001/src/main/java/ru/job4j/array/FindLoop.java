package ru.job4j.array;

/**
 * Square
 *
 * @author glissovskiy (leginBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {

    /**
     * Поиск элемента в массиве.
     * @param data Массив для поиска.
     * @param el искомое число.
     * @return Индекс найдеенного числа либо -1.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
