package com.expression.impl;


import com.expression.Context;
import com.expression.Expression;

/**
 * @author: xupengboo
 * @date: 2024/2/29 16:40
 * @description: 数字表达式
 */
// 终结符表达式
public class NumberExpression implements Expression {

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }

}
