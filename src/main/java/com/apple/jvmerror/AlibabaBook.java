package com.apple.jvmerror;

/**
 * @Author Double_apple
 * @Date 2022/2/28 21:54
 * @Version 1.0
 */
public class AlibabaBook {

    static int a;
    int b;
    public static void main(String[] args) {
        test1();

        System.out.println(a);
    }

    public static void test1() {
        Integer a = 129;
        Integer b = 129;
        System.out.println(a == b);
        System.out.println(a.equals(b)); //包装类值的比较，用equals
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();


    }
}
