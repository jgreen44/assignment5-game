package random;

import java.util.Random;


/**
 * The type Random generators.
 */
public class RandomGenerators {

  private final Random random;

  public RandomGenerators() {
    random = new Random();
  }

  public boolean getRandomTrueFalse() {
    return random.nextBoolean();
  }
}
