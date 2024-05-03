package com;

import com.color.Color;
import com.factory.ColorFactory;
import com.factory.ShapeFactory;
import com.shape.Shape;

public class App {

    public static void main(String[] args) {
        // 形状产品
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();
        // 颜色产品
        ColorFactory colorFactory = new ColorFactory();
        Color red = colorFactory.createColor("RED");
        red.fill();
        Color blue = colorFactory.createColor("BLACK");
        blue.fill();
    }
}
