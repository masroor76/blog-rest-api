package com.baloch.restapi.repository;

import com.baloch.restapi.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository <Blog, Integer> {
}
