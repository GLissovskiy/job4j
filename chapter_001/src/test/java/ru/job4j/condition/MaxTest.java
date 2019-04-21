package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author glissovskiy (legionBSD@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenMax1to2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5to3Then5() {
        Max max = new Max();
        int result = max.max(5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax4to4Then4() {
        Max max = new Max();
        int result = max.max(4, 4);
        assertThat(result, is(4));
    }
}
