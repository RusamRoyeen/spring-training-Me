package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PUSH")
public class PushNotificationProxy implements CommentNotificationProxy {


    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment to push notification" + comment.getText());
    }
}
