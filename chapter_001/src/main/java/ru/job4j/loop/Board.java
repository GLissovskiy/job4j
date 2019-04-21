package ru.job4j.loop;

/**
 * @author glissovskiy (legionBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * Отрисовывает шахматную доску в псевдографике.
     * @param width Размерность доски ширина.
     * @param height Размерность доски высота.
     * @return Возвращает строку отрисованной доски.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= width; i++) {
            for (int y = 1; y <= height; y++) {
                if ((i + y) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
