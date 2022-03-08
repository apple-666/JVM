package com.apple.reference;

/**
 * @Author Double_apple
 * @Date 2022/2/25 14:37
 * @Version 1.0
 */
public class StrongReferenceDemo {

    public static void main(String[] args) {
        Object a = new Object();//为强引用 最普通的引用类型
        Object b = a; //也是强引用

        a = null;
        System.gc();
        System.out.println(a);
        System.out.println(b);

    }
}
