package com.factory;

import com.color.Color;
import com.shape.Circle;
import com.shape.Rectangle;
import com.shape.Shape;

/**
 * 形状工厂
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape createShape(String shapeType) {
        if("CIRCLE".equals(shapeType)) {
            return new Circle();
        }
        else if("RECTANGLE".equals(shapeType)) {
            return new Rectangle();
        }
        else {
            return null;
        }
    }

    @Override
    public Color createColor(String colorType) {
        return null;
    }
}
