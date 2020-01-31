import behaviours.FlyNoWay;
import behaviours.QuackSqueeze;

/**
 * RubberDuck
 */
public class RubberDuck extends Duck {
  public RubberDuck() {
    quackBehaviour = new QuackSqueeze();
    flyBehaviour = new FlyNoWay();
  }
}