package com.company.test;

class JoinTest implements Runnable{

    public static int a = 0;

    @Override
    public void run() {
        for (int k = 0; k < 5; k++) {
            a = a + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        Runnable r = new JoinTest();
        Thread t = new Thread(r);
        t.start();
        //t.join(); //加入join()
        for (int i=0; i<30000000; i++) {
            if(i%100==0)
            System.out.print(a);
        }
        System.out.println(a);
    }
}
