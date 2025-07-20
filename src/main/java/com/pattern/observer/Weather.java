package com.pattern.observer;

public interface Weather {
    void notifyObservers();
    void registerObserver(Observer observer);
    void unRegisterObservers(Observer observer);
}
