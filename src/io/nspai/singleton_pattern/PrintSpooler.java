package io.nspai.singleton_pattern;

public class PrintSpooler {

    //private static final PrintSpooler  = spooler = new PrintSpooler();
    private static PrintSpooler spooler;

    private static boolean initialized = false;

    private PrintSpooler(){

    }
    private void init(){
        // TODO code to initialize our print spooler goes here
    }

    public static PrintSpooler getInstance(){
        if(initialized) return spooler;
        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
        return spooler;
    }
}
