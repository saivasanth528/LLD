package DesignPatterns.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {


    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int level, String message) {
        if(level == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(level, message);
        }
    }



}
