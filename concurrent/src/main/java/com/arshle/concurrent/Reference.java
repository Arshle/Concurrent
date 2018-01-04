/*
 * FileName: Reference.java
 * Author:   Arshle
 * Date:     2017年09月02日
 * Description:   
 */
package com.arshle.concurrent;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author Arshle
 */
public class Reference {
    public static void main(String[] args) throws UnknownHostException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com",2181);
        System.out.println(inetSocketAddress.getHostName());
    }
}
