package com.springboot.service;

import com.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static{
        items.add(new StackoverflowWebsite("stackoverflow","http://stackoverflow.com",
                "http://cdn.sstatic.net/Site/stackoverflow/img/favicon.ico", "Stack Overflow (StackExchange)",
                "for professional and enthusiast programmers"));
        items.add(new StackoverflowWebsite("serverfault","http://serverfault.com",
                "http://cdn.sstatic.net/Site/serverfault/img/favicon.ico", "Server Fault (StackExchange)",
                "for system and network administrators"));
    }

    public List<StackoverflowWebsite> findAll(){
        return items;
    }
}

