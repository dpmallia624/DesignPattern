package com.pattern.behavioral.observer;

public interface Weather {
    void notifyObservers();
    void registerObserver(Observer observer);
    void unRegisterObservers(Observer observer);
}
