package lewandowski;

/**
 * Main
 */
public class App {

  public static void main(String[] args) {
    WeatherData wd = new WeatherData();

    CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
    StatisticsDisplay sd = new StatisticsDisplay(wd);

    wd.setMeasurements(getTemp(), getHumidity(), getPressure());
    wd.setMeasurements(getTemp(), getHumidity(), getPressure());
  }

  public static int getRandomNumber(int min, int max) {
    return (int) (Math.random() * ((max - min) + 1)) + min;
  }

  public static float getTemp() {
    return getRandomNumber(-50, 50);
  }

  public static float getHumidity() {
    return getRandomNumber(0, 100);
  }

  public static float getPressure() {
    return getRandomNumber(0, 2000);
  }
}
