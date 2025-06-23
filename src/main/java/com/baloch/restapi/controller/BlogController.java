package com.baloch.restapi.controller;

import com.baloch.restapi.model.Blog;
import com.baloch.restapi.service.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/blogs")
    public List<Blog> getBlogs () {
        return blogService.getAllBlogs();
    }
    
    @GetMapping("/blog/{blogId}")
    public Optional<Blog> getBlogById (@PathVariable int blogId) {
        return blogService.getBlogById(blogId);
    }

    @PostMapping("/blog")
    public Blog getBlog (@RequestBody Blog blog) {
        return blogService.createBlog(blog);
    }

    @DeleteMapping("/blog/{blogId}")
    public String deleteBlog (@PathVariable int blogId) {
        blogService.deleteBlogById(blogId);
        return "Blog Deleted Successfully.";
    }

    @PutMapping("/blog/{blogId}")
    public Blog updateBlogById (@PathVariable int blogId , @RequestBody Blog updatedBlog) {
        return blogService.updateBlog(blogId, updatedBlog);//, updatedBlog));
    }
}