package com.akrem.proxy;

import com.akrem.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);

}
