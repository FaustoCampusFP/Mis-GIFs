package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class GifController{
    private GifRepository repository;

    public GifController(GifRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api-gifs")
    public Collection<Gif> getGifs() {
        return repository.findAll();
    }
}
