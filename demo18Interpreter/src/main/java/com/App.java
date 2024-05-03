package com;


import com.expression.Context;
import com.expression.Expression;
import com.expression.impl.AddExpression;
import com.expression.impl.NumberExpression;

/**
 * Hello world!
 * 解释器解释语言中的句子，例如：编译器、四则运算。
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 执行a + b 四则运算：
        Context context = new Context();
        context.setVariable("a",10);
        context.setVariable("b",20);

        Expression expression = new AddExpression(
                new NumberExpression(context.getVariable("a")),
                new NumberExpression(context.getVariable("b"))
        );

        int result = expression.interpret(context);
        System.out.println("Result：" + result);
    }

}
