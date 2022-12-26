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

//       CommentService commentService1 = container.getBean(CommentService.class);
//        CommentService commentService2 = container.getBean(CommentService.class);
//        System.out.println(commentService1 == commentService2);
//        System.out.println(commentService1);
//        System.out.println(commentService2);


    }
}
