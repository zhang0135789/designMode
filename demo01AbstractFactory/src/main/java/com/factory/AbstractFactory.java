package com.factory;

import com.color.Color;
import com.shape.Shape;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

    public abstract Shape createShape(String shapeType);

    public abstract Color createColor(String colorType);

}
