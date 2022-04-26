package Souts;

import java.util.Random;


public class Souts {

  private final Random random;

  public Souts() {
    random = new Random();
  }

  public boolean getRandomTrueFalse() {
    return random.nextBoolean();
  }

  public int getRandom100() {
    return random.nextInt(100);
  }

  public int getRandom50() {
    return random.nextInt(50);
  }

  public int getRandom10() {
    return random.nextInt(10);
  }


}
