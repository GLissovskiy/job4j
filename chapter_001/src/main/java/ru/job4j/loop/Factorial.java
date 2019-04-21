package ru.job4j.loop;

/**
 * @author glissovskiy (legionBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * Расчитывает факториал числа.
     * @param n Первое число.
     * @return Факториал числа n.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
