package com.akrem;

import com.akrem.config.ProjectConfig;
import com.akrem.model.Comment;
import com.akrem.serivce.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("spring framework");

        ApplicationContext container = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = container.getBean(CommentService.class);
         commentService.publishComment(comment);

    }
}
