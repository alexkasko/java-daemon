package com.alexkasko.daemon;

import java.util.Date;

/**
 * User: alexey
 * Date: 3/9/12
 */
public class Launcher {
    public static void main(String args[]) throws InterruptedException {
        while(true) {
            System.out.println(new Date() + ", I'm running as daemon");
            Thread.sleep(5000);
        }
    }
}
