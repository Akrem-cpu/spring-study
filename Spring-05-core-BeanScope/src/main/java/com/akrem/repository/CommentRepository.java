package com.akrem.repository;

import com.akrem.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
