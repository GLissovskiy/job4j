package ru.job4j.tracker;

import java.util.*;

/**
 * Class ConsoleInput.
 * @author legionbsd (legionbsd@gmail.com).
 * @since 0.1
 * @version $Id$
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Ask the user and return his answer.
     * @param question - question for the user.
     * @return user answer.
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}