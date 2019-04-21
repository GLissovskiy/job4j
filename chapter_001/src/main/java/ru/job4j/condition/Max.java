package ru.job4j.condition;

/**
 * @author glissovskiy (legionBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * Возвращает большее число.
     * @param left Первое число.
     * @param right Второе число.
     * @return Большее число.
     */
    public int max(int left, int right) {
        return (left > right) ? left : right;
    }
}
