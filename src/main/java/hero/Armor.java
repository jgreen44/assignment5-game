package hero;

import java.util.Random;

/**
 * The enum Armor.
 */
public enum Armor {

  BRANDED_ARMOR("Branded Armor"),
  BREASTPLATE("Breastplate"),
  BUCKLER("Buckler"),
  CHAIN_SHIRT("Chain Shirt"),
  FULL_PLATE("Full Plate"),
  HALF_PLATE("Half Plate"),
  HEAVY_STEEL_SHIELD("Heavy Steel Shield"),
  LEATHER_ARMOR("Leather Armor"),
  LIGHT_STEEL_SHIELD("light Steel Shield"),
  PADDED_ARMOR("Padded Armor"),
  PADDED_SHIELD("Padded Shield"),
  PLATE_MAIL("Plate Mail"),
  SHIELD("Shield"),
  STUDDED_ARMOR("Studded Armor"),
  STUDDED_SHIELD("Studded Shield"),
  WOODEN_SHIELD("Wooden Shield"),
  CHAIN_MAIL("Chain Mail");


  private static final Random random = new Random();
  private final String name;

  Armor(String type) {
    this.name = type;
  }

  public static Armor getRandomArmor() {
    final int randomIndex = random.nextInt(values().length);
    return values()[randomIndex];
  }

  @Override
  public String toString() {
    return name;
  }
}
