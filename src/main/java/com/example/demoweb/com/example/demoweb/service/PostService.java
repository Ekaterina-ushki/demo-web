package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts(){
        return new ArrayList<Post> (Arrays.asList(new Post("айтишник плачет", new Date()),
                                                  new Post("но он не смог", new Date()),
                                                  new Post("сдать дедлайны раньше", new Date())));
    }
}
