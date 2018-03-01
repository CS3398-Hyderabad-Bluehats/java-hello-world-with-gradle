package hello;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGreeter {

    private Greeter g;

    @Before
    public void setUp() throws Exception {
        g = new Greeter();
    }

    @Test
    public void testGreeterEmpty() {
        assertEquals(g.getName(), "");
        assertEquals(g.sayHello(), "Hello!");
    }

    @Test
    public void testGreeter() {
        g.setName("World");
        assertEquals(g.getName(), "World");
        assertEquals(g.sayHello(), "Hello World!");
    }

    @Test
    public void newtestMHSGreeterPass() {
        g.setName("with love from Texas");
        assertNotEquals(g.getName(), "with love from Russia");
        assertEquals(g.sayHello(), "Hello with love from Texas!");
    }

    @Test
    public void newtestMHSGreeterFail() {
        assertNull(g.getName());
    }
}