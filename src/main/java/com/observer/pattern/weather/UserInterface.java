package com.observer.pattern.weather;

import com.observer.pattern.*;

public class UserInterface implements Observer {
    private int temperature;
    private int windSpeed;
    private int pressure;

    private Subject weatherStation; // Each Observer needs a reference to the Subject it is subscribing to, so it can register itself

    public UserInterface(Subject subject) {
        this.weatherStation = subject;
        subject.registerObserver(this);
    }

    @Override
    public void unsubscribe() {
        weatherStation.removeObserver(this);
    }

    @Override
    public void update(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("### From UserInterface ###");
        System.out.println("Temperature: " + temperature);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Pressure: " + pressure);
    }
}
