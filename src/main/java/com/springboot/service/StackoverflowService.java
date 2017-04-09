package com.springboot.service;

import com.springboot.model.StackoverflowWebsite;
import com.springboot.persistence.StackoverflowWebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {

    @Autowired
    private StackoverflowWebsiteRepository repositpry;

    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static{
        items.add(new StackoverflowWebsite("stackoverflow","http://stackoverflow.com",
                "http://cdn.sstatic.net/Site/stackoverflow/img/favicon.ico", "Stack Overflow (StackExchange)",
                "for professional and enthusiast programmers"));
        items.add(new StackoverflowWebsite("serverfault","http://serverfault.com",
                "http://cdn.sstatic.net/Site/serverfault/img/favicon.ico", "Server Fault (StackExchange)",
                "for system and network administrators"));
    }

    @PostConstruct
    public void init(){
        repositpry.save(items);
    }

    public List<StackoverflowWebsite> findAll(){
        return repositpry.findAll();
    }
}

