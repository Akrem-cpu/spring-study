package com.akrem.service;

import com.akrem.model.Comment;
import com.akrem.proxy.CommentNotificationProxy;
import com.akrem.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Lazy
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentService {
    @Value("${name}")
    public   String name ;
    @Value("${days}")
    public String[] days;


    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("email") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("hello");
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }


}
