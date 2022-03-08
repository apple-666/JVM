package com.apple.垃圾收集器;

import java.util.concurrent.TimeUnit;

/**
 * @Author Double_apple
 * @Date 2022/2/25 16:09
 * @Version 1.0
 */
public class G1 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(111);

        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
