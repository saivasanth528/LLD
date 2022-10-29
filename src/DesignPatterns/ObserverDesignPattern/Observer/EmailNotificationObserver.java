package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver{

    private String email;
    private StockObservable stockObservable;

    public EmailNotificationObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void sendNotification() {
        sendEmail("Product is in stock , hurry up");
    }
    private void sendEmail(String msg) {
        System.out.println("Email send to the client" + this.email + " " + msg);
    }
}
