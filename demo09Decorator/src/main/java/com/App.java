package com;


import com.coffee.Coffee;
import com.coffee.impl.Espresso;
import com.decorator.decorator.MilkDecorator;
import com.decorator.decorator.SugarDecorator;

/**
 * Hello world!
 * 针对某个对象进行功能扩展或者包装，以 给咖啡 加牛奶 加糖为例，同一杯咖啡添加牛奶与不添加牛奶价格可能不同，同理加糖也是。
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        Coffee coffee = new Espresso();
        // 加奶
        coffee = new MilkDecorator(coffee);
        // 加糖
        coffee = new SugarDecorator(coffee);
        // 最后消费：
        System.out.println("Cost：" + coffee.cost());
    }

}
