package com.visitor;


import com.element.impl.Article;
import com.element.impl.Comment;

/**
 * @Author xupengboo
 * @Date 2024/3/12 12:54
 * @Describe 访问者接口
 */
public interface BlogVisitor {

    void visitArticle(Article article);

    void visitComment(Comment comment);

}
