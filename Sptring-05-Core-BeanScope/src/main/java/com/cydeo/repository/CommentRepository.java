package com.cydeo.repository;

import com.cydeo.model.Comment;

public interface CommentRepository {
    void storeCommment(Comment comment);
}
