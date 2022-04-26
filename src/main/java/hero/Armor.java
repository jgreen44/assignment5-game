package hero;

/**
 * The enum Armor.
 */
public enum Armor {

  BRANDED_ARMOR("branded armor"),
  BREASTPLATE("breastplate"),
  BUCKLER("buckler"),
  CHAIN_SHIRT("chain shirt"),
  FULL_PLATE("full plate"),
  HALF_PLATE("half plate"),
  HEAVY_STEEL_SHIELD("heavy steel shield"),
  LEATHER_ARMOR("leather armor"),
  LIGHT_STEEL_SHIELD("light steel shield"),
  PADDED_ARMOR("padded armor"),
  PADDED_SHIELD("padded shield"),
  PLATE_MAIL("plate mail"),
  SHIELD("shield"),
  STUDDED_ARMOR("studded armor"),
  STUDDED_SHIELD("studded shield"),
  WOODEN_SHIELD("wooden shield"),
  CHAIN_MAIL("chain mail");


  private final String title;

  Armor(String title) {
    this.title = title;
  }

  /**
   * Gets random armor.
   *
   * @return the random armor
   */
  public static Armor getRandomArmor() {
    return values()[(int) (Math.random() * values().length)];
  }

  @Override
  public String toString() {
    return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
  }
}
