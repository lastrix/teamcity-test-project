package org.lastrix.teamcity;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleClientTest {

    @Test
    public void getMessage() {
        ExampleClient client = new ExampleClient("World");

        assertEquals("Must be 'Hello, World!'", "Hello, World!", client.getMessage());
    }
}
