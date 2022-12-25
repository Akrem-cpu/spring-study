package com.akrem.proxy;

import com.akrem.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending notification comment : " + comment.getText());
    }
}
