package com.apple.jvmerror.oom;

import java.util.concurrent.TimeUnit;

public class OOMEUnableCreateNewThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
//            在Linux OS（CentOS）运行，会出现下列的错误，线程数大概在900多个 宝
            System.out.println("************** i = " + i);
            new Thread(() -> {
                try {
                    TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }
}
