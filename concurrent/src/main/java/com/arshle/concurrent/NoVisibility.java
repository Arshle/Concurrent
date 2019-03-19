/*
 * FileName: NoVisibility.java
 * Author:   Arshle
 * Date:     2019年03月18日
 * Description: 线程可见性测试
 */
package com.arshle.concurrent;

/**
 * 〈线程可见性测试〉<br>
 * 〈线程可见性测试〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class NoVisibility {
    /**
     * 线程共享boolean变量
     */
    private static boolean ready = false;
    /**
     * 线程共享数字变量
     */
    private static int number = 0;
    /**
     * 读线程
     */
    private static class ReaderThread extends Thread{

        @Override
        public void run() {
            while (!ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
