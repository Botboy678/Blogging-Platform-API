package com.blogging.RESTAPI.controller;

import com.blogging.RESTAPI.BloggingPlatformApiApplication;
import com.blogging.RESTAPI.model.BlogPost;
import com.blogging.RESTAPI.repo.blogpostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class APIController {

    @Autowired
    blogpostRepo blogRepo;

    @GetMapping(value = "/")
    public String welcome(){
        return "Welcome";
    }

    @GetMapping(value = "/posts")
    public List<BlogPost> getAllPosts() {
        return blogRepo.findAll();
    }

    @PutMapping(value = "/createPost")
    public String addPost(@RequestBody BlogPost blogPost) {
        blogRepo.save(blogPost);
        return "Post Added Twin!";
    }

    @PostMapping(value = "update/{id}")
    public String updatePost(@PathVariable long id, @RequestBody BlogPost blogPost) {
        BlogPost newblogPost = blogRepo.findById(id).get();
        newblogPost.setTitle(blogPost.getTitle());
        newblogPost.setCategory(blogPost.getCategory());
        newblogPost.setContent(blogPost.getContent());
        newblogPost.setTag(blogPost.getTag());
        blogRepo.save(newblogPost);
        return "Post Updated Twin!";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deletePost(@PathVariable long id) {
        blogRepo.deleteById(id);
        return "Post Dihleted twin!";
    }

    @GetMapping(value = "/post/{id}")
    public Optional<BlogPost> getSpecificPost(@PathVariable long id) {
        return blogRepo.findById(id);
    }

    @GetMapping(value = "/searchPosts")
    public List<BlogPost> searchPost(@RequestParam("term") String term) {
       return blogRepo.findByTerm(term);
    }


}
