package com.factory;

import com.color.Black;
import com.color.Color;
import com.color.Red;
import com.shape.Shape;

/**
 * 颜色工厂
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape createShape(String shapeType) {
        return null;
    }

    @Override
    public Color createColor(String colorType) {
        if("RED".equals(colorType)) {
            return new Red();
        }
        else if("BLACK".equals(colorType)) {
            return new Black();
        }
        else {
            return null;
        }
    }
}
