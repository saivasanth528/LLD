package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.Observable.IPhoneStockObservable;
import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;
import DesignPatterns.ObserverDesignPattern.Observer.EmailNotificationObserver;
import DesignPatterns.ObserverDesignPattern.Observer.MobileNotificationObserver;
import DesignPatterns.ObserverDesignPattern.Observer.NotificationObserver;

public class Stock {
    public static void main(String args[]) {
        StockObservable iPhoneStockObservable = new IPhoneStockObservable();
        NotificationObserver emailNotification = new EmailNotificationObserver("vasisai128@gmail.com", iPhoneStockObservable);
        NotificationObserver mobileNotification = new MobileNotificationObserver("7680845022", iPhoneStockObservable);
        iPhoneStockObservable.add(emailNotification);
        iPhoneStockObservable.add(mobileNotification);
        iPhoneStockObservable.setStockCount(100);
    }
}
