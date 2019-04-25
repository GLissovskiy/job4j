package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] except = {"Привет", "Мир", "Супер"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate2() {
        String[] array = {"1", "1", "2", "2", "3", "3"};
        String[] except = {"1", "2", "3"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate3() {
        String[] array = {"3", "1", "2", "2", "3", "1"};
        String[] except = {"1", "2", "3"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate4() {
        String[] array = {"2", "1", "2", "3", "3", "1"};
        String[] except = {"1", "2", "3"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate5() {
        String[] array = {"3", "3", "3", "1", "2", "1"};
        String[] except = {"1", "2", "3"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate6() {
        String[] array = {"3", "3", "3", "3", "2", "1"};
        String[] except = {"1", "2", "3"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate7() {
        String[] array = {"1", "2", "3", "3", "2", "1"};
        String[] except = {"1", "2", "3"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate8() {
        String[] array = {"3", "3"};
        String[] except = {"3"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}