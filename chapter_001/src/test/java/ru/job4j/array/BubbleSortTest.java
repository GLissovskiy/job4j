package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        int[] unsorted = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(unsorted);
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(sorted, is(expect));
    }

    @Test
    public void whenSortArrayWith4ElementsThenSortedArray() {
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        int[] unsorted = new int[] {11, 9, 4, 16};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(unsorted);
        int[] expect = new int[] {4, 9, 11, 16};
        assertThat(sorted, is(expect));
    }

    @Test
    public void whenSortArrayWith4AnotherElementsThenSortedArray() {
        int[] unsorted = new int[] {16, 9, 4, 11};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(unsorted);
        int[] expect = new int[] {4, 9, 11, 16};
        assertThat(sorted, is(expect));
    }


    @Test
    public void whenSortArrayWith7ElementsThenSortedArray() {
        int[] unsorted = new int[] {4, 62, 33, 2, 45, 323, 5};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(unsorted);
        int[] expect = new int[] {2, 4, 5, 33, 45, 62, 323};
        assertThat(sorted, is(expect));
    }
}