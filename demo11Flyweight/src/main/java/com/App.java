package com;


import com.shape.Shape;
import com.shape.factory.ShapeFactory;

/**
 * Hello world!
 * 就是通过共享对象来减少内存中对象的数量，最常见的例如：数据库的连接池。
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        String[] colors = {"Red","Green","Blue"};
        for (int i = 0; i < 10; i++) {
            String color = colors[(int) (Math.random() * colors.length)];
            Shape circle = ShapeFactory.getCircle(color);
            circle.draw();
        }
    }

}
