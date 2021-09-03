package io.nspai.singleton_pattern;

/**
 * @author Ninespace
 */
public class ResourceManager {

    public static void main(String[] args) {

       // PrintSpooler spooler = new PrintSpooler(); this will give you an error due to a Private constructor instead
        PrintSpooler spooler = PrintSpooler.getInstance(); // this should work.

        //Dealing with the threading concept
        //First Thread
        Thread threadOne = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});

        // Second Thread
        Thread threadTwo = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});
        threadOne.start();
        threadTwo.start();
    }
}
