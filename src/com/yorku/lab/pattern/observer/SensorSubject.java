package com.yorku.lab.pattern.observer;

public interface SensorSubject {
    void addObserver(SensorObserver observer);
    void removeObserver(SensorObserver observer);
    void notifyObservers();
}
