package lewandowski;

import java.util.ArrayList;

/**
 * WeatherData
 */
public class WeatherData implements Subject {
  ArrayList<Observer> observers = new ArrayList<>();
  float temp;
  float humidity;
  float pressure;

  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(temp, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
