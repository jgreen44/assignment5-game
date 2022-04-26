package hero;

/**
 * The enum Hair type.
 */
public enum HairType {

  STRAIGHT("Straight"),
  WAVY("Wavy"),
  KINKY("Kinky"),
  PONYTAIL("Ponytail"),
  CURLY("Curly"),
  BALD("Bald"),
  LONG_AND_STRAIGHT("Long and straight"),
  LONG_AND_WAVY("Long and wavy"),
  LONG_AND_KINKY("Long and kinky"),
  LONG_AND_PONYTAIL("Long and ponytail"),
  LONG_AND_CURLY("Long and curly"),
  SHORT_AND_CURLY("Short and curly"),
  SHORT_AND_STRAIGHT("Short and straight"),
  SHORT_AND_WAVY("Short and wavy"),
  SHORT_AND_KINKY("Short and kinky"),
  SHORT_AND_PONYTAIL("Short and ponytail");

  private final String title;

  HairType(String title) {
    this.title = title;
  }

  public static HairType getRandomHairType() {
    return values()[(int) (Math.random() * values().length)];
  }

  @Override
  public String toString() {
    return title;
  }
}
