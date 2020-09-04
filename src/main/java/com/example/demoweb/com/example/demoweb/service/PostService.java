package com.example.demoweb.com.example.demoweb.service;

import com.example.demoweb.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts(){
        return new ArrayList<Post> (Arrays.asList(new Post("dfgd"),new Post("dfgdh"),new Post("fghfh")));
    }
}
