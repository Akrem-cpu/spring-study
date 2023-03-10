package com.akrem.proxy;

import com.akrem.model.Comment;
import com.sun.deploy.net.protocol.ProtocolType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("push")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push Notification for Comment " + comment.getText());
    }
}
