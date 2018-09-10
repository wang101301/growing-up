package com.wang.growing.chapter_02;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author wangyuanyuan@zto.com
 * @Description: ArrayList 线程不安全
 * @date 2018/9/10/17:22
 */
public class UnSafeArrayList {
    static Vector v1 = new Vector(); ;

    public static class AddThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                v1.addElement(i);
            }
        }
    }

    public static void main(String[] args)  throws InterruptedException{
        Thread thread1 = new Thread(new AddThread());
        Thread thread2 = new Thread(new AddThread());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(v1.size());
    }
}
