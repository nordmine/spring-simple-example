package ru.devmark.test.handlers;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateHandler implements Handler {

    @Override
    public String getString() {
        return LocalDateTime.now().toString();
    }
}
