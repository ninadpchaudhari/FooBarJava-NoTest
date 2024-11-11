package edu.siena;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OFooBarTest {

    @BeforeEach
    public void setUp() {
        // Any setup code if needed
    }

    @Test
    public void testFoo() {
        assertEquals("Foo", App.fooBar(3));
        assertEquals("Foo", App.fooBar(6));
    }
}