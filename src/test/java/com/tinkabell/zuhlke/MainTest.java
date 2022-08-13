package com.tinkabell.zuhlke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void helloWorld() {
        // Arrange
        Main main = new Main();
        String expected =  "HelloWorld";

        // Act
        String actual = main.helloWorld();

        // Assert
        assertEquals(expected, actual, "Should get 'Hello World' String");
    }
}