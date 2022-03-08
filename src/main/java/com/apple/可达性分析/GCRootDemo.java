package com.apple.可达性分析;

/**
 * @Author Double_apple
 * @Date 2022/2/25 10:08
 * @Version 1.0
 */
//虚拟机栈（栈帧中的局部变量区，也叫做局部变量表）中引用的对象。
//方法区中的类静态属性引用的对象。
//方法区中常量引用的对象。
//本地方法栈中JNI(Native方法)引用的对象。
public class GCRootDemo {

//    private static GCRootDemo2 t2;  方法区中的类静态属性引用的对象
//    private static final GCRootDemo3 t3 = new GCRootDemo3();  方法区中常量引用的对象。

    public static void m1(){
        GCRootDemo t1 = new GCRootDemo();
    }

    public static void main(String[] args) {
        m1();//虚拟机栈（栈帧中的局部变量区，也叫做局部变量表）中引用的对象。
    }
}
