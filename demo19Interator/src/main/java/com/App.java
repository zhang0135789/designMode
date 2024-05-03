package com;


import com.aggregate.Aggregate;
import com.aggregate.impl.ConcreteAggregate;
import com.iterator.Iterator;

/**
 * Hello world!
 * 用于顺序访问集合对象的元素，例如：Java的集合。
 */
// 客户端代码
public class App {
    public static void main( String[] args ) {
        // 迭代器 - 集合
        int[] array = {1,2,3,4,5};
        Aggregate aggregate = new ConcreteAggregate(array);
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
