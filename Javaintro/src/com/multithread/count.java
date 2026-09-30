package com.multithread;

class Siva extends Thread {

    static int count = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            count++;
        }
    }
}

public class count extends Siva {

    public static void main(String[] args) {

        Siva s = new Siva();
        s.start();

        Siva r = new Siva();
        r.start();

        try {
            s.join();
            r.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count = " + Siva.count);
    }
}