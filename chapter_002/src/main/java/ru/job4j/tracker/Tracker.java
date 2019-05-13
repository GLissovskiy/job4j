package ru.job4j.tracker;

import java.util.Random;

/**
 * Class Tracker.
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Random generator.
     */
    private static final Random RANDOM = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        return String.valueOf(RANDOM.nextInt());
    }

    /**
     * Method replace item by id.
     *
     * @param id   Id item for replacing.
     * @param item new item.
     */
    public boolean replace(String id, Item item) {
        boolean flag = false;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i] = item;
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * Delete item by id.
     * @param id input id of  item.
     */
    public boolean delete(String id) {
        boolean flag = false;
        Item[] temp = new Item[this.position];
        int start = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.position--;
                start = i;
                flag = true;
                break;
            } else {
                temp[i] = this.items[i];
            }
        }
        System.arraycopy(this.items, start + 1, temp, start, this.position - start);
        this.items[this.position] = null;
        System.arraycopy(temp, 0, this.items, 0, this.position);
        return flag;
    }

    /**
     * Find all elements.
     * @return arraycopy of elements.
     */
    public Item[] findAll() {
        Item[] found = new Item[this.position];
        System.arraycopy(this.items, 0, found, 0, this.position);
        return found;
    }

    /**
     * Search item by name.
     * @param key search word.
     * @return list of elements with searched name.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(key)) {
                result[count++] = this.items[i];
            }
        }
        return result;
    }

    /**
     * Search item by id.
     * @param id input parameter.
     * @return result item.
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }
}
