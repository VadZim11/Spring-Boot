package com.springboot.service;

import com.springboot.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {
    private static List<StackoverflowWebsite> items = new ArrayList<>();
    static{
        items.add(new StackoverflowWebsite("stackoverflow","));
    }

    public List<StackoverflowWebsite> findAll(){
        return items;
    }
}

