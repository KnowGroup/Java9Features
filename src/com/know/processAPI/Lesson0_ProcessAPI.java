package com.know.processAPI;

/**
 * Major enhancement to communicate with underlying processor / machine
 * e.g 
 * ProcessHandle.current().pid(); // Just one line to check Process ID of JVM
 * 
 * 
 * @author KnowGroup
 */
public class Lesson0_ProcessAPI {

    public static void main(String[] arg) throws InterruptedException{
        long pid = ProcessHandle.current().pid();
        System.out.println("Current process ID : "+pid);
        Thread.sleep(10000);
    }
}
