package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;

public class MobileNotificationObserver implements NotificationObserver{

    private final String phoneNumber;
    private final StockObservable stockObservable;

    public MobileNotificationObserver(String phoneNumber, StockObservable stockObservable) {
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void sendNotification() {
        sendAppNotification("Product is in stock hurry up");
    }

    private void sendAppNotification(String msg) {
        System.out.println("App notification sent to " + this.phoneNumber + " " + msg);
    }
}
