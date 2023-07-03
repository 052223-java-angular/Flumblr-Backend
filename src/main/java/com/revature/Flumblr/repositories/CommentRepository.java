package com.revature.Flumblr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.Flumblr.entities.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
}

