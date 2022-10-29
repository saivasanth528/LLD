package DesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable{

    List<NotificationObserver> observerList = new ArrayList<>();
    private int currentStockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        this.observerList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        this.observerList.remove(notificationObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver notificationObserver: observerList) {
            notificationObserver.sendNotification();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(currentStockCount == 0) {
            notifySubscribers();
        }
        this.currentStockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return currentStockCount;
    }
}
