/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: NoVisibility.java
 * Author:   Arshle
 * Date:     2017年09月04日
 * Description:   
 */
package com.arshle.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arshle
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;
    private static final List<String>  list = new ArrayList<String>();

    private static class ReaderThread extends Thread{
        @Override
        public void run() {
            synchronized (list){

            }
            while(!ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

    }
}
