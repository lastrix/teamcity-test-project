package org.lastrix.teamcity;

public final class ExampleClient {
    public ExampleClient(String name) {
        this.name = name;
    }

    private final String name;

    public String getMessage() {
        return "Hello, " + name + "!";
    }
}
