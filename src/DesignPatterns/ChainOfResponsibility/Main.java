package DesignPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String args[]) {

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.DEBUG, "Its a debug message");
        logProcessor.log(LogProcessor.ERROR, "Its a error message");
        logProcessor.log(LogProcessor.INFO, "Its a info message");
        logProcessor.log(5, "Unknown level message");
    }
}
