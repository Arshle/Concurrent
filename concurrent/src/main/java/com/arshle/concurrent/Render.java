/*
 * FileName: Render.java
 * Author:   Arshle
 * Date:     2017年09月04日
 * Description:   
 */
package com.arshle.concurrent;

import java.util.concurrent.*;

/**
 * @author Arshle
 */
public class Render {

    private final ExecutorService executor;

    Render(ExecutorService executor){
        this.executor = executor;
    }

    void renderPage(CharSequence source){
        CompletionService<String> completionService = new ExecutorCompletionService<String>(executor);
    }

    private static void timedRun(Runnable r, long timeout, TimeUnit unit){
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<?> task = executor.submit(r);
        executor.shutdownNow();
        try {
            task.get(timeout, unit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            task.cancel(true);
        }
    }

    public static void main(String[] args) {

    }
}
