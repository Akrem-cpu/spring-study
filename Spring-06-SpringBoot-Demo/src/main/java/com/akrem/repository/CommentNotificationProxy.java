package com.akrem.repository;

import com.akrem.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);

}
