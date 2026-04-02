package com.yorku.lab.pattern.observer;

public interface SensorSubject {
    void attach(SensorObserver observer);
    void detach(SensorObserver observer);
    void notifyObservers();
}
