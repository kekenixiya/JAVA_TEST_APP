package com.cn.test;


class deadLockThread  implements Runnable {
    private String lockA ;
    private String lockB ;

    public deadLockThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println("获取线程locka" + lockA);
            synchronized (lockB){
                System.out.println("获取线程lockb" + lockB);
            }
        }
    }
}


public class test11 {
    public static void main(String[] args) {
        String aaa = "aaa";
        String bbb = "bbb";
        new Thread(new deadLockThread(aaa,bbb),"ThreadAAA").start();
        new Thread(new deadLockThread(bbb,aaa),"ThreadBBB").start();
    }
}
