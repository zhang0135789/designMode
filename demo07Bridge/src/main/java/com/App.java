package com;


import com.draw.GreenCircle;
import com.draw.RedCircle;
import com.shape.Circle;
import com.shape.Shape;

// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 本意：创建不同形状大小和不同颜色的圆形
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(200, 200, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
