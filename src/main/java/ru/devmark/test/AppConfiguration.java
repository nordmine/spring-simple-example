package ru.devmark.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.devmark.test.handlers.Handler;
import ru.devmark.test.handlers.NameHandler;

@Configuration
public class AppConfiguration {

    @Bean
    public Handler firstNameHandler() {
        return new NameHandler("Alice");
    }

    @Bean
    public Handler secondNameHandler() {
        return new NameHandler("Bob");
    }
}
