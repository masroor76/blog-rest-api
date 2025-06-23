package com.baloch.restapi.service;

import com.baloch.restapi.model.Blog;
import com.baloch.restapi.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    private final BlogRepository blogRepo;

    public BlogService(BlogRepository blogRepo) {
        this.blogRepo = blogRepo;
    }

    public List<Blog> getAllBlogs(){
        return blogRepo.findAll();
    }

    public Optional<Blog> getBlogById(Integer blogId){
        return blogRepo.findById(blogId);
    }
    
    public Blog createBlog(Blog blogData){
        blogRepo.save(blogData);
        return blogData;
    }

    public void deleteBlogById(Integer blogId){
        blogRepo.deleteById(blogId);
    }


    public Blog updateBlog(Integer id , Blog blogData){
        Blog updateBlogDataFromDB = blogRepo.findById(id).orElseThrow();
        updateBlogDataFromDB.setTitle(blogData.getTitle());
        updateBlogDataFromDB.setDes(blogData.getDes());
        return blogRepo.save(updateBlogDataFromDB);
    }

//    Helper Methods
    public Blog setValuesForUpdate(Blog dbBlog , Blog inputBlog){
        System.out.println(inputBlog.getId());
        System.out.println("??????????????");
        System.out.println(dbBlog.getId());

        dbBlog.setTitle(inputBlog.getTitle());
        dbBlog.setDes(inputBlog.getDes());
        return dbBlog;
    }

}
