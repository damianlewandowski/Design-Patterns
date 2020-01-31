import behaviours.FlyWithWings;
import behaviours.Quack;

/**
 * MallardDuck
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
    flyBehaviour = new FlyWithWings();
    quackBehaviour = new Quack();
  }
}