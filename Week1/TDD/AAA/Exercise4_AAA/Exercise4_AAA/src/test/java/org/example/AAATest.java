package org.example;

import org.junit.*;
import static org.junit.Assert.*;

public class AAATest {

    private int value;

    @Before
    public void setUp() {
        value = 10;
    }

    @After
    public void tearDown() {
        value = 0;
    }

    @Test
    public void testAAA() {
        // Arrange
        int add = 20;

        // Act
        int result = value + add;

        // Assert
        assertEquals(30, result);
    }
}
