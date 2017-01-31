package ru.devmark.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.devmark.test.services.MainService;

public class TestApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        MainService service = context.getBean(MainService.class);
        service.doWork();
    }
}
