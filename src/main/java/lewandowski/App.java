package lewandowski;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Beverage beverage1 = new HouseBlend();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription());
    System.out.println(beverage1.cost());

    Beverage beverage2 = new Espresso();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription());
    System.out.println(beverage2.cost());
  }
}
