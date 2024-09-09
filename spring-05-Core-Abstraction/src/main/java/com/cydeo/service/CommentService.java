package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxy;
import com.cydeo.repository.CommentRepository;
import com.cydeo.repository.DBCommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;


    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }


    public void publishComment(Comment comment) {
        //save in the DB
        commentRepository.storeComment(comment);
        //send email
        commentNotificationProxy.sendComment(comment);



    }
}
