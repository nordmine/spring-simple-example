package ru.devmark.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.devmark.test.handlers.Handler;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Autowired
    private List<Handler> handlers;

    @Override
    public void doWork() {
        handlers.forEach(h -> System.out.println(h.getString()));
    }
}
