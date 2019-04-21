package ru.job4j.loop;

/**
 * @author glissovskiy (legionBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * Возвращает сумму четных чисел в диапазоне.
     * @param start Первое число.
     * @param end Второе число.
     * @return Сумма четных чисел в диапазоне start end.
     */
    public int add(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
