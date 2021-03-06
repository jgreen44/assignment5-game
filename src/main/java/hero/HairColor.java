package hero;

/**
 * The enum Hair color.
 */
public enum HairColor {

  GREEN, YELLOW, RED, BLUE, ORANGE, BLACK, PURPLE, BROWN, WHITE, BLOND;

  public static HairColor getRandomHairColor() {
    return values()[(int) (Math.random() * values().length)];
  }

  @Override
  public String toString() {
    return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
  }
}
