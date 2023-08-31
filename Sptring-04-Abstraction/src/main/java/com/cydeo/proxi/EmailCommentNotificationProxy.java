package com.cydeo.proxi;

import com.cydeo.model.Comment;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment){
        System.out.println("Sending notification for comment : "+ comment.getText());
    }
}
