package com.akrem;

import com.akrem.model.Comment;
import com.akrem.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
      ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("spring framework");

        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
        System.out.println(cs.name);

        System.out.println(Arrays.toString(cs.days));

    }

}
