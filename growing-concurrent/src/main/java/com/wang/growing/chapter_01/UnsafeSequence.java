package com.wang.growing.chapter_01;


/**
 * @author wangyuanyuan@zto.com
 * @Description: 12
 * @date 2018/8/31/17:08
 */
public class UnsafeSequence implements Runnable {
    private int value;

    /**
     * 获取唯一数值
     *
     * @return
     */
    private synchronized int getNext() {
        return value++;
    }

    @Override
    public void run() {
        System.out.println(System.currentTimeMillis() + ",Thread name:" + Thread.currentThread().getName() + ",value:" + getNext());
    }
}
