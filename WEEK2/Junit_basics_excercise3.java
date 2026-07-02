package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Junit_basics_excercise3 {
    @Test
    void testAssertions() {


        assertEquals(10, 5 + 5);
        assertNotEquals(10, 5 + 4);
        assertTrue(10 > 5);
        assertFalse(10 < 5);

        String s = null;
        assertNull(s);

        Object obj = new Object();
        assertNotNull(obj);
        Object a = obj;
        assertSame(obj, a);

        Object b = new Object();
        assertNotSame(obj, b);
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);

        List<String> l1 = Arrays.asList("A", "B", "C");
        List<String> l2 = Arrays.asList("A", "B", "C");
        assertIterableEquals(l1, l2);

        // Exception
        assertThrows(ArithmeticException.class, () -> {
            int x = 10 / 0;
        });


        assertTimeout(Duration.ofSeconds(1), () -> {
            Thread.sleep(100);
        });

    }

}