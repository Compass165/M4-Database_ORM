package com.codegym.service.comment;

import com.codegym.model.Comment;
import com.codegym.service.IGeneralService;

import java.util.List;
public interface ICommentService extends IGeneralService {
    List<Comment> findAllWithinDay();

    Comment findById(Long id);

    Comment save(Comment comment);
}
