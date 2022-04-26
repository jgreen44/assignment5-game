import static treasure.TreasureItemTypes.COINS;
import static treasure.TreasureItemTypes.GEMS;
import static treasure.TreasureItemTypes.POTIONS;
import static treasure.TreasureItemTypes.RINGS;
import static treasure.TreasureItemTypes.RODS;
import static treasure.TreasureItemTypes.SCROLLS;
import static treasure.TreasureItemTypes.WANDS;
import static treasure.TreasureItemTypes.WEAPONS;

import Souts.Souts;
import com.github.javafaker.Faker;
import hero.Armor;
import hero.CharacterType;
import hero.HairColor;
import hero.HairType;
import hero.Hero;
import hero.Weapon;
import treasure.TreasureForHero;
import treasure.TreasureItemTypes;
import villian.BossEnemies;
import villian.MediumEnemies;
import villian.SmallEnemies;

public class Main {

  private static final TreasureForHero TREASURE_CHEST = new TreasureForHero();

  private static void demonstrateTreasureChestIteratorForType(TreasureItemTypes treasureItemTypes) {
    System.out.println("-------------------------");
    System.out.println("Item Iterator for TreasureItemTypes " + treasureItemTypes + ": ");
    var itemIterator = TREASURE_CHEST.iterator(treasureItemTypes);
    while (itemIterator.hasNext()) {
      System.out.println(itemIterator.next().toString());
    }
    itemIterator.remove();

    while (itemIterator.hasNext()) {
      System.out.println(itemIterator.next().toString());
    }

  }

  public static void main(String[] args) {

    int count = 1;
    boolean smallEnemy = false;
    boolean mediumEnemy = false;


    Faker faker = new Faker();
    String heroName = faker.name().firstName();

    System.out.println("Building your random character...please wait.....");

    // REQUIREMENT #1 - Builder Pattern
    // Create a random character class

    // REQUIREMENT #2 - Builder Pattern
    // Create a random character with skills

    // REQUIREMENT #3 - Builder Pattern
    // Create a random character minimum three unique weapon items
    var hero = new Hero.Builder(CharacterType.getRandomCharacterType(),
        heroName) // character type and name
        .getHeightFeet(faker.number().numberBetween(3, 8))
        .getHeightInches(faker.number().numberBetween(0, 11))
        .getHairType(HairType.getRandomHairType()) // hair type
        .getHairColor(HairColor.getRadonHairColor())
        .getArmor(Armor.getRandomArmor()) // armor
        // TODO - can't seem to get the 2nd and 3rd weapons to hold unique items
        .getWeapon(Weapon.getRandomWeapon())  // weapon 1
        .getWeapon2(Weapon.getRandomWeapon())  // weapon 2
        .getWeapon3(Weapon.getRandomWeapon())  // weapon 3
        .getHealth(faker.number().numberBetween(1, 10000))  // health
        .getMana(faker.number().numberBetween(1, 1000)) //  mana
        .getStrength(faker.number().numberBetween(1, 500))  // strength
        .getAgility(faker.number().numberBetween(100, 1000))  // agility
        .getIntelligence(faker.number().numberBetween(100, 100)) // intelligence
        .getLuck(faker.number().numberBetween(0, 300))// luck
        .getLevel(faker.number().numberBetween(1, 100)) // level
        .getExperience(faker.number().numberBetween(1, 100)) // experience
        .build();
    System.out.println(hero.toString());

    System.out.println("----------------------------------------------------");
    System.out.println("----------------LETS BEGIN THE GAME!----------------");
    System.out.println("----------------------------------------------------");
    System.out.println("\n");

    // Set initial health

    double initialHealth = hero.getHealth();
    double currentHealth = hero.getHealth();

    while (hero.getHealth() > 0) {

      System.out.println("\nRoom " + count);

      // REQUIREMENT #1 - Decorator Pattern
      /*  Encounter small enemy every floor,
          medium enemy every fifth floor,
          and boss every 10th floor */
      String enemyType;
      if (count % 10 == 0) {
        enemyType = "Boss Enemy";
      } else if (count % 5 == 0) {
        mediumEnemy = true;
        enemyType = "Medium Enemy";
      } else {
        smallEnemy = true;
        enemyType = "Small Enemy";
      }
      var smallEnemyObj = new SmallEnemies();
      var mediumEnemyObj = new MediumEnemies(smallEnemyObj);
      var bossEnemyObj = new BossEnemies(mediumEnemyObj);

      System.out.println("Walking into Room " + count + ", you encounter a " + enemyType);
      if (smallEnemy) {
        System.out.println("The small enemy attacks...");
        smallEnemyObj.attack();
      } else if (mediumEnemy) {
        System.out.println("The medium enemy attacks...");
        mediumEnemyObj.attack();
      } else {
        System.out.println("The boss enemy attacks...");
        bossEnemyObj.attack();
      }

      System.out.println("Do you take a hit?");

      Souts souts = new Souts();

      // logic if you take a hit to health or not.
      if (souts.getRandomTrueFalse()) {
        System.out.println("You took a hit!");
        hero.setHealth(smallEnemy ? hero.getHealth() - smallEnemyObj.getEnemyPower() :
            mediumEnemy ? hero.getHealth() - mediumEnemyObj.getEnemyPower() :
                hero.getHealth() - bossEnemyObj.getEnemyPower());
        hero.setHealth(hero.getHealth() - smallEnemyObj.getEnemyPower());
        System.out.println("Your new health points are: " + hero.getHealth());


        currentHealth = hero.getHealth();
        System.out.println(HealthBar.getHealthBar((int) initialHealth, (int) currentHealth));
        System.out.println(HealthBar.getHealthBarPercentage(initialHealth, currentHealth));

      } else {
        System.out.println("You got away! Consider yourself lucky! Go buy a lottery ticket.");
      }

      smallEnemy = false;
      mediumEnemy = false;

      count++;
    }

    System.out.println("You're dead. Game over. Go study SER 316.");

    // REQUIREMENT #1 - Iterator Pattern
    // Shop should sell 3 random objects.
    demonstrateTreasureChestIteratorForType(COINS);
    demonstrateTreasureChestIteratorForType(GEMS);
    demonstrateTreasureChestIteratorForType(POTIONS);
    demonstrateTreasureChestIteratorForType(RINGS);
    demonstrateTreasureChestIteratorForType(RODS);
    demonstrateTreasureChestIteratorForType(SCROLLS);
    demonstrateTreasureChestIteratorForType(WANDS);
    demonstrateTreasureChestIteratorForType(WEAPONS);

    // REQUIREMENT #2 - Iterator Pattern
    // After battle, have chance to buy items from treasure chest.

    // REQUIREMENT #3 - Iterator Pattern
    // Gain experience after battle to increase skill or magic power upgrade.

  }


  private static class HealthBar {
    private static final String HEALTH_BAR = "Health: ";
    private static final String HEALTH_PERCENTAGE = "Health %: ";

    public static String getHealthBarPercentage(double initialHealth, double currentHealth) {
      return HEALTH_PERCENTAGE + String.format("%.2f", ((currentHealth) / initialHealth) * 100);
    }

    public static String getHealthBar(int initialHealth, int currentHealth) {
      return HEALTH_BAR + currentHealth + "/" + initialHealth;
    }
  }
}

