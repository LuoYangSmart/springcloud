package com.luoyang.provider.service;

import java.util.LinkedList;

/**
 * @Auther: Luozhen
 * @Date: 2019/5/6 15:38
 * @Description:
 */
public class PCtest {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store(new LinkedList<Integer>());

        Thread producer1 = new Thread(new Producer(store,2)) ;
        Thread producer2 = new Thread(new Producer(store,3)) ;
        Thread consumer1 = new Thread(new Consumer(store)) ;
        Thread consumer2 = new Thread(new Consumer(store)) ;
        Thread consumer3 = new Thread(new Consumer(store)) ;

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
        Thread.sleep(1000);
        Thread producer3 = new Thread(new Producer(store,4)) ;
        producer3.start();

    }
}
