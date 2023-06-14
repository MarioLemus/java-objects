package org.javaInternals.BuiltinObjects.ThreadObj;

import static org.javaInternals.App.log;
public class Threads {
    public Threads() {
        // next objects to learn:
        // [x] hashmap
        // [x] array
        // [x] math
        // [x] exception
        // thread

        // date
        // file
        // system

        // start(): start the thread execution
        Thread ex1 = new Thread();
        ex1.start();

        // run(): define the code that will run in a thread
        Thread ex2 = new Thread();
        ex2.run();

        // join(): wait fot thread to stop execution
        Thread ex3 = new Thread();

        try {
            ex3.join();
        } catch (Exception e) {
            log(e.getMessage());
        }

        // Thread.sleep(milliseconds): make the thread to get suspended for a period of time
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            log(e);
        }

        // interrupt(): interrupt the thread if it's in waiting or locked state
        Thread ex4 = new Thread();
        ex4.interrupt();

        // isAlive(): verify if thread is in active state
        Thread ex5 = new Thread();
        ex5.isAlive();

        // setName(name): set a name for the thread
        Thread ex6 = new Thread();
        ex6.setName("thread 1 yes");

        // getName(): return thread's name
        Thread ex7 = new Thread();
        ex7.getName();

        // getId(): return an unique thread's ID
        Thread ex8 = new Thread();
        ex8.getId();

        // getState(): return the current state of the thread
        Thread ex9 = new Thread();
        ex9.getState();

        // yield(): indicate the thread is willing to give its turn to other threads
        Thread ex10 = new Thread();
        ex10.yield();

        // setPriority(int priority): set a priority for the thread
        Thread ex11 = new Thread();
        ex11.setPriority(1);

        // getPriority(): return the thread's priority
        Thread ex12 = new Thread();
        ex12.getPriority();

        // isInterrupted(): verify if hte thread has been interrupted
        Thread ex13 = new Thread();
        ex13.isInterrupted();

        // Thread.currentThread(): return a reference to the current thread who is executing the method
        Thread ex14 = new Thread();
        Thread.currentThread();
    }
}
