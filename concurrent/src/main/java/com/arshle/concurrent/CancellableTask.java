/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: CancellableTask.java
 * Author:   Arshle
 * Date:     2017年09月05日
 * Description:   
 */
package com.arshle.concurrent;

import java.util.concurrent.Callable;

/**
 * @author Arshle
 */
public interface CancellableTask<T> extends Callable<T> {
    void cancel();
}
