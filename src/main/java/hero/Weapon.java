package hero;

import java.util.Random;

/**
 * The enum Weapon.
 */
public enum Weapon {

  CLUB("Club", 5),
  DAGGER("Dagger", 100),
  GREAT_CLUB("Great Club", 200),
  HAND_AXE("Hand Axe", 300),
  JAVELIN("Javelin", 400),
  LIGHT_HAMMER("Light hammer", 500),
  MACE("Mace", 600),
  QUARTER_STAFF("Quarterstaff", 700),
  SICKLE("Sickle", 800),
  SPEAR("Spear", 900),
  CROSSBOW("Crossbow", 1000),
  DART("Dart", 1100),
  SHORT_BOW("Short bow", 1200),
  SLING("Sling", 1300),
  BATTLEAXE("Battle Axe", 1400),
  FLAIL("Flail", 1500),
  GLAIVE("Glaive", 1600),
  GREAT_AXE("Great Axe", 1700),
  GREAT_SWORD("Great Sword", 1800),
  HALBERD("Halberd", 1900),
  LANCE("Lance", 2000),
  LONGSWORD("Longsword", 2100),
  MAUL("Maul", 2200),
  MORNINGSTAR("Morningstar", 2300),
  PIKE("Pike", 2400),
  RAPIER("Rapier", 2500),
  SCIMITAR("Scimitar", 2600),
  SHORT_SWORD("Short sword", 2700),
  TRIDENT("Trident", 2800),
  WAR_PICK("War pick", 2900),
  WAR_HAMMER("War hammer", 3000),
  WHIP("Whip", 3100),
  BLOWGUN("Blowgun", 3200),
  CROSSBOW_CROSSBOW_BOLT("Crossbow, crossbow bolt", 3300),
  DART_TIP("Dart, tip", 3400),
  SLING_STONE("Sling, stone", 3500),
  SLING_BULLET("Sling, bullet", 3600),
  BOW_ARROW("Bow, arrow", 3700),
  CROSSBOW_BOLT("Crossbow, bolt", 3800),
  JAVELIN_HEAD("Javelin, head", 3900),
  SPEAR_HEAD("Spear, head", 4000),
  TRIDENT_HEAD("Trident, head", 4100),
  LIGHT_CROSSBOW("Light crossbow", 4200),
  DART_SHOOTER("Dart, shooter", 4300),
  SLING_SHOOTER("Sling, shooter", 4400),
  BOW_SHOOTER("Bow, shooter", 4500),
  CROSSBOW_SHOOTER("Crossbow, shooter", 4600),
  JAVELIN_SHOOTER("Javelin, shooter", 4700),
  SPEAR_SHOOTER("Spear, shooter", 4800),
  TRIDENT_SHOOTER("Trident, shooter", 4900),
  HEAVY_CROSSBOW("Heavy crossbow", 5000),
  LONGBOW("Longbow", 5100),
  NET("Net", 5200);

  private static final Random random = new Random();
  private final String name;
  private final int damage;

  Weapon(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }

  public static Weapon getRandomWeapon() {
    final int randomIndex =
        random.nextInt(values().length); // return a value of 0..values().legnth - 1);
    return values()[randomIndex];
  }

  public String getName() {
    return name;
  }

  public int getDamage() {
    return damage;
  }

  @Override
  public String toString() {
    return name + " causing damage of: " + damage;
  }
}
