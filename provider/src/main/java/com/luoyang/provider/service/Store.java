package com.luoyang.provider.service;

import java.util.Queue;
import java.util.Random;

/**
 * @Auther: Luozhen
 * @Date: 2019/5/6 15:04
 * @Description:
 */
public class Store {
    private Queue<Integer> queue;
    private final int CAPACITY = 5;

    public Store(Queue<Integer> queue) {
        this.queue = queue;
    }

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public  void take() throws InterruptedException {
        synchronized(queue){
            while (queue.size() == 0){
                System.out.println(Thread.currentThread() + "queue no element,please wait");
                queue.wait();
            }
            System.out.println(Thread.currentThread() + "take element " + queue.poll());
            queue.notifyAll();
            Thread.sleep(new Random().nextInt(1000));
        }

    }

    public synchronized void put(Integer integer) throws InterruptedException {
        synchronized (queue){
            while (queue.size() == CAPACITY){
                System.out.println(Thread.currentThread() + "queue can not put element,please wait");
                queue.wait();
            }
            System.out.println(Thread.currentThread() + "put element " + queue.add(integer));
            queue.notifyAll();
            Thread.sleep(new Random().nextInt(1000));
        }
    }
}
