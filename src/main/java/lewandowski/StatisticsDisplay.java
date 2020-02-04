package lewandowski;

/**
 * StatisticsDisplay
 */
public class StatisticsDisplay implements Observer, DisplayElement {
  float minTemp = 0;
  float maxTemp = 0;
  float avgTemp = 0;
  float minHumidity = 0;
  float maxHumidity = 0;
  float avgHumidity = 0;
  float minPressure = 0;
  float maxPressure = 0;
  float avgPressure = 0;
  Subject weatherData;

  public StatisticsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void display() {
    System.out.println(String.format("Min Temp: %f, Max Temp: %f, Avg Temp: %f", minTemp, maxTemp, avgTemp));
    System.out.println(
        String.format("Min Humidity: %f, Max Humidity: %f, Avg Humidity: %f", minHumidity, maxHumidity, avgHumidity));
    System.out.println(
        String.format("Min Pressure: %f, Max Pressure: %f, Avg Pressure: %f", minPressure, maxPressure, avgPressure));
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    if (temp < minTemp) {
      minTemp = temp;
    }

    else if (temp > maxTemp) {
      maxTemp = temp;
    }

    avgTemp = avgTemp + temp / 2;

    if (humidity < minHumidity) {
      minHumidity = humidity;
    }

    else if (humidity > maxHumidity) {
      maxHumidity = humidity;
    }

    avgHumidity = avgHumidity + humidity / 2;

    if (pressure < minPressure) {
      minPressure = pressure;
    }

    else if (pressure > maxPressure) {
      maxPressure = pressure;
    }

    avgPressure = avgPressure + pressure / 2;

    display();
  }
}