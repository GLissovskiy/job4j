package ru.job4j.array;

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что действительно слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса.
     */
    public boolean startWith(String prefix) {
        boolean result = false;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
