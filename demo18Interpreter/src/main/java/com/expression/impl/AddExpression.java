package com.expression.impl;


import com.expression.Context;
import com.expression.Expression;

/**
 * @author: xupengboo
 * @date: 2024/2/29 16:41
 * @description: 加表达式
 */
// 非终结符表达式
public class AddExpression implements Expression {

    private Expression left;

    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

}
