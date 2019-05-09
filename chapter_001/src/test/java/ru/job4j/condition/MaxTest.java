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

    @Test
    public void whenMax4to5and6Then6() {
        Max max = new Max();
        int result = max.max(4, 5, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax9to6and3Then9() {
        Max max = new Max();
        int result = max.max(9, 6, 3);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax4to7and8Then8() {
        Max max = new Max();
        int result = max.max(4, 7, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax1to2and3and4Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}
