package observer1;

import java.util.ArrayList;
import java.util.List;

public class Meteostation implements Observered{
    private int temperature;
    private int pressure;
    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int temp, int press){
        this.temperature = temp;
        this.pressure = press;
        notifyObservers();
    }


    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.handleEvent(temperature, pressure);
        }
    }
}
