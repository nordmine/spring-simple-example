package ru.devmark.test.handlers;

public class NameHandler implements Handler {

    private final String name;

    public NameHandler(String name) {
        this.name = name;
    }

    @Override
    public String getString() {
        return name;
    }
}
