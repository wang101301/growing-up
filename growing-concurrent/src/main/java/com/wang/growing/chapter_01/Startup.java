package com.wang.growing.chapter_01;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author wangyuanyuan@zto.com
 * @Description: 12
 * @date 2018/9/3/13:21
 */
public class Startup {

    private static final ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();
    private static final ExecutorService executorService = new ThreadPoolExecutor(5, 10,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingDeque<Runnable>(1024), threadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        UnsafeSequence unsafeSequence = new UnsafeSequence();
        Thread thread = new Thread(new UnsafeSequence());
        thread.start();

        for (int i = 0; i < 100; i++) {
            executorService.execute(unsafeSequence);
        }
        executorService.shutdown();
    }
}
