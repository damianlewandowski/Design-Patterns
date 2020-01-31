import behaviours.FlyNoWay;
import behaviours.Quack;

/**
 * ModelDuck
 */
public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new Quack();
  }

}