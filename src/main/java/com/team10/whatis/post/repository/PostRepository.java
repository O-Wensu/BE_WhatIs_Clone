package com.team10.whatis.post.repository;

import com.team10.whatis.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}