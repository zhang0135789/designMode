package com;


import com.element.impl.Article;
import com.element.impl.Comment;
import com.visitor.impl.PrintVisitor;
import com.visitor.impl.WordCountVisitor;

/**
 * Hello world!
 * 主要将数据结构与数据操作分离。
 */
// 客户端
public class App {

    public static void main( String[] args ) {
        // 定义被访问元素
        Article article = new Article("This is an article content.");
        Comment comment = new Comment("This is a comment content.");

        // 访问元素 字数
        WordCountVisitor wordCountVisitor = new WordCountVisitor();
        article.accept(wordCountVisitor);
        comment.accept(wordCountVisitor);
        System.out.println("Total word count: " + wordCountVisitor.getCount());

        // 访问元素 打印
        PrintVisitor printVisitor = new PrintVisitor();
        article.accept(printVisitor);
        comment.accept(printVisitor);
    }

}
