package ru.job4j.condition;

/**
 * @author glissovskiy (legionBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MultiMax {
    /**
     * Возвращает большее число.
     * @param first Первое число.
     * @param second Второе число.
     * @param third Третье число.
     * @return Большее число.
     */
    public int max(int first, int second, int third) {
        return first > second ? (first > third ? first : third) : (second > third ? second : third);
    }
}
