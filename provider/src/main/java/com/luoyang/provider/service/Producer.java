package com.luoyang.provider.service;

/**
 * @Auther: Luozhen
 * @Date: 2019/5/6 15:34
 * @Description:
 */
public class Producer implements Runnable{
    private Store store;
    private Integer integer;

    public Producer(Store store, Integer integer) {
        this.store = store;
        this.integer = integer;
    }

    @Override
    public void run() {
        try {
            store.put(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
