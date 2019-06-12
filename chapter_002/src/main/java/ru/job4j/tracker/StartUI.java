package ru.job4j.tracker;

/**
 * Class StartUI.
 * @author legionbsd (legionbsd@gmail.com).
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа меню для - show all items.
     */
    private static final String SHOW = "1";

    /**
     * Константа меню для - edit item.
     */
    private static final String EDIT = "2";

    /**
     *  Константа меню для - delete item.
     */
    private static final String DELETE = "3";

    /**
     *  Константа меню для - find item by id.
     */
    private static final String FIND_BY_ID = "4";

    /**
     * Константа меню для - find item by name.
     */
    private static final String FIND_BY_NAME = "5";


    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Choose your destiny : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showAll();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FIND_BY_ID.equals(answer)) {
                this.findById();
            } else if (FIND_BY_NAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * display all tasks.
     */
    private void showAll() {
        System.out.println("------------ List of all tasks --------------");
        for (Item items : this.tracker.findAll()) {
            System.out.println("Id: " + items.getId() + " Name: "
                    + items.getName() + " Description: " + items.getDecs());
        }
        System.out.println("------------ End of list --------------");
    }

    /**
     * editItem by id.
     */
    private void editItem() {
        System.out.println("------------ Edit task --------------");
        String id = this.input.ask("Enter the task ID that you want to change :");
        String name = this.input.ask("Enter the name of the task :");
        String desc = this.input.ask("Enter the description of the task :");
        this.tracker.replace(id, new Item(id, name, desc));
        System.out.println("------------ Editing complete --------------");
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Create new task --------------");
        String name = this.input.ask("Enter the task ID :");
        String desc = this.input.ask("Enter the description :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ New task Id : " + item.getId() + "-----------");
    }

    /**
     * method deleteItem by id.
     */
    private void deleteItem() {
        System.out.println("------------ Delete task by id --------------");
        String id = this.input.ask("Enter the task ID :");
        this.tracker.delete(id);
        if (this.tracker.findById(id) != null) {
            System.out.println("------------ Item was deleted --------------");
        } else {
            System.out.println("There is no task with tis id.");
        }
    }

    /**
     * method findById by id.
     */
    private void findById() {
        System.out.println("------------ Find task by id --------------");
        String id = this.input.ask("Enter the task ID :");
        Item found = this.tracker.findById(id);
        if (this.tracker.findById(id) != null) {
            System.out.println("Id: " + found.getId() + " Name: "
                    + found.getName() + " Description: " + found.getDecs());
        } else {
            System.out.println("There is no task with this id.");
        }
        System.out.println("------------ End of search --------------");
    }

    /**
     * method findByName by name.
     */
    private void findByName() {
        System.out.println("------------ Find task by Name --------------");
        String name = this.input.ask("Enter the tasks name :");
        Item[] items = this.tracker.findByName(name);
        if (items != null) {
            for (Item item : items) {
                System.out.println("Id: " + item.getId() + " Name: "
                        + item.getName() + " Description: " + item.getDecs());
            }
        } else {
            System.out.println("No data found with name " + name + ".");
        }
        System.out.println("------------ End of search --------------");
    }

    private void showMenu() {
        System.out.println("Menu.");
        // добавить остальные пункты меню.
        System.out.println("0. Add new item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }

    /**
     * Запускт программы.
     * @param args параметры
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}