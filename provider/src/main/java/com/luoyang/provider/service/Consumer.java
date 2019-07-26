package com.luoyang.provider.service;

/**
 * @Auther: Luozhen
 * @Date: 2019/5/6 15:37
 * @Description:
 */
public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            store.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
