import behaviours.FlyWithWings;

/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    Duck maduck = new MallardDuck();
    Duck ruduck = new RubberDuck();

    Duck[] ducks = { maduck, ruduck };

    for (Duck duck : ducks) {
      duck.performFly();
      duck.performQuack();
    }

    Duck moduck = new ModelDuck();
    moduck.performFly();
    moduck.setFlyBehaviour(new FlyWithWings());
    moduck.performFly();
  }

}