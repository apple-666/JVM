package com.apple;

/**
 * @Author Double_apple
 * @Date 2022/2/25 11:01
 * @Version 1.0
 */
@SuppressWarnings("all")
public class XX参数 {
    public static void main(String[] args) {

        int a[] =new int[10000000];
        long totalMemory = Runtime.getRuntime().totalMemory(); //jvm中的内存总量
        long maxMemory = Runtime.getRuntime().maxMemory(); //jvm试图用的最大内存

        System.out.println("jvm中的内存总量totalmemory(Xms):"+totalMemory);//Xms默认为内存1/63
        System.out.println("jvm试图用的最大内存maxmemory(Xmx):"+maxMemory);//Xmx默认为内存1/4
    }
}
