package com;


import com.strategy.impl.AlipayStrategy;
import com.strategy.impl.CreditCardStrategy;
import com.strategy.impl.WechatPayStrategy;

/**
 * Hello world!
 * 将每个算法封装在独立的类中，使得它们可以互相替换。
 */
public class App {
    public static void main( String[] args ) {
        PaymentContext context = new PaymentContext(new CreditCardStrategy());
        context.executePayment(100.0); // 信用卡支付

        context.setStrategy(new AlipayStrategy());
        context.executePayment(100.0); // 支付宝支付

        context.setStrategy(new WechatPayStrategy());
        context.executePayment(100.0);// 微信支付
    }
}
