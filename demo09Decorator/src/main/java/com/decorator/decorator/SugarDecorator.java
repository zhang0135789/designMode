package com.decorator.decorator;

import com.coffee.Coffee;
import com.decorator.CoffeeDecorator;

/**
 * @author: xupengboo
 * @date: 2024/2/18 15:53
 * @description: 加糖装饰类
 */
// 具体装饰器
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.3;
    }
}
