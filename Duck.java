import behaviours.FlyBehaviour;
import behaviours.QuackBehavior;

/**
 * Duck
 */
public class Duck {
  public FlyBehaviour flyBehaviour;
  public QuackBehavior quackBehaviour;

  public void swim() {
  };

  public void display() {
  };

  public void performFly() {
    flyBehaviour.fly();
  }

  public void performQuack() {
    quackBehaviour.quack();
  }

  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  public void setQuackBehaviour(QuackBehavior quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

}