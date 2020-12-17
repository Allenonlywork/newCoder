package com.solutions.s40_50;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 多线程输出
 */
public class Solution49 implements Runnable{
    private String name;
    private Object prev;
    private Object self;
    private int count;
    private Solution49(String name, Object prev, Object self, int count) {
        this.name = name;
        this.prev = prev;
        this.self = self;
        this.count = count;
    }
    @Override
    public void run() {
        // int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int count = Integer.valueOf(br.readLine());
        Solution49 pa = new Solution49("A", d, a, count);
        Solution49 pb = new Solution49("B", a, b, count);
        Solution49 pc = new Solution49("C", b, c, count);
        Solution49 pd = new Solution49("D", c, d, count);

        new Thread(pa).start();
        Thread.sleep(100); // 确保按顺序A、B、C执行
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
        new Thread(pd).start();
    }
}
