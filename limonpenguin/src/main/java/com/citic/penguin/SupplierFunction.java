package com.citic.penguin;

import java.util.function.Supplier;

/**
 * @author： ym
 * @description: 函数式编程
 * @date: Created in 7:04 PM 2019/6/20
 * @modified By:
 */
public class SupplierFunction<T> {
    public T food(Supplier<T> supplier) {
        return supplier.get();
    }

//    函数式编程不同的写法
    public static void main(String[] args) {
        SupplierFunction function = new SupplierFunction();
//        Object obj = function.food(() -> 250);
        Object obj = function.food(() -> {
            return 250;
        });
        System.out.println(obj);
    }

}
