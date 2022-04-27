import static treasure.TreasureItemTypes.COINS;
import static treasure.TreasureItemTypes.GEMS;
import static treasure.TreasureItemTypes.POTIONS;
import static treasure.TreasureItemTypes.RINGS;
import static treasure.TreasureItemTypes.RODS;
import static treasure.TreasureItemTypes.SCROLLS;
import static treasure.TreasureItemTypes.WANDS;
import static treasure.TreasureItemTypes.WEAPONS;

import com.github.javafaker.Faker;
import hero.Armor;
import hero.CharacterType;
import hero.HairColor;
import hero.HairType;
import hero.Hero;
import hero.Weapon;
import random.RandomGenerators;
import treasure.Item;
import treasure.TreasureForHero;
import treasure.TreasureItemTypes;
import villian.BossEnemies;
import villian.MediumEnemies;
import villian.SmallEnemies;

/**
 * The type Main.
 */
public class Main {

  private static final TreasureForHero TREASURE_CHEST = new TreasureForHero();

  private static void treasureItemsIterator(TreasureItemTypes treasureItemTypes) {
    treasureItemsOutput(treasureItemTypes);
    var itemIterator = TREASURE_CHEST.iterator(treasureItemTypes);
    while (itemIterator.hasNext()) {
      System.out.println(itemIterator.next().toString());
    }
  }


  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    int count = 1;
    boolean smallEnemy = false;
    boolean mediumEnemy = false;
    boolean encounteredBattle = false;
    boolean gameWon = false;

    Faker faker = new Faker();

    System.out.println("Building your random character...please wait.....\n");

    // REQUIREMENT #1 - Builder Pattern
    // Create a random character class
    var hero = new Hero.Builder()
        .characterType(CharacterType.getRandomCharacterType())// random character type
        .name(faker.name().firstName())
        .heightInFeet(faker.number().numberBetween(3, 8))
        .heightInInches(faker.number().numberBetween(0, 11))
        .hairType(HairType.getRandomHairType()) // hair type
        .hairColor(HairColor.getRandomHairColor())
        .armor(Armor.getRandomArmor()) // armor

        // REQUIREMENT #2 - Builder Pattern
        // Create a random character minimum three unique weapon items
        .weapon(Weapon.getRandomWeapon())  // weapon 1
        .weapon2nd(Weapon.getRandomWeapon())  // weapon 2
        .weapon3rd(Weapon.getRandomWeapon())  // weapon 3
        .health(faker.number().numberBetween(1, 10000))  // health
        .mana(faker.number().numberBetween(1, 1000)) //  mana
        .strength(faker.number().numberBetween(1, 500))  // strength
        .agility(faker.number().numberBetween(100, 1000))  // agility
        .intelligence(faker.number().numberBetween(100, 100)) // intelligence
        .luck(faker.number().numberBetween(0, 300))// luck
        .level(faker.number().numberBetween(1, 100)) // level

        // REQUIREMENT #3 - Builder Pattern
        // Create a random character with skills
        .experience(faker.number().numberBetween(1, 100)) // experience
        .build();

    currentStats(hero);
    beginGameOutput();

    // Set initial health
    double initialHealth = hero.getHealth();
    double currentHealth;

    while (hero.getHealth() > 0) {

      System.out.println("\nRoom " + count);

      // REQUIREMENT #1 - Decorator Pattern
      /*
      Encounter small enemy every floor, medium enemy every fifth floor, and boss
      every 10th floor
      */
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

      // REQUIREMENT #2 - Decorator Pattern
      // All enemies should get harder for each floor you travel to
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

      RandomGenerators souts = new RandomGenerators();

      // logic if you take a hit to health or not.
      if (souts.getRandomTrueFalse()) {
        encounteredBattle = true;
        System.out.println("You took a hit!");
        hero.setHealth(smallEnemy ? hero.getHealth() - smallEnemyObj.getEnemyPower() :
            mediumEnemy ? hero.getHealth() - mediumEnemyObj.getEnemyPower() :
                hero.getHealth() - bossEnemyObj.getEnemyPower());
        hero.setHealth(hero.getHealth() - smallEnemyObj.getEnemyPower());
        System.out.println("Your new health points are: " + hero.getHealth());


        currentHealth = hero.getHealth();
        System.out.println(HealthBar.getHealthBar((int) initialHealth, (int) currentHealth));
        System.out.println(HealthBar.getHealthBarPercentage(initialHealth, currentHealth));

        // REQUIREMENT #3 - Iterator Pattern
        // If health is below 15%, go to top floor.
        if (HealthBar.getHealthBarPercentageDouble(initialHealth, currentHealth) < 15) {
          count = 0;
        }
      } else {
        System.out.println("You got away! Consider yourself lucky! Go buy a lottery ticket.");
      }

      smallEnemy = false;
      mediumEnemy = false;

      if (encounteredBattle) {
        // REQUIREMENT #1 - Iterator Pattern
        // Shop should sell 3 random objects.
        System.out.println("After battle, you encounter a treasure chest that has multiple items:");
        treasureItemsIterator(COINS);
        treasureItemsIterator(GEMS);
        treasureItemsIterator(POTIONS);
        treasureItemsIterator(RINGS);
        treasureItemsIterator(RODS);
        treasureItemsIterator(SCROLLS);
        treasureItemsIterator(WANDS);
        treasureItemsIterator(WEAPONS);

        Item randomTreasure = TreasureForHero.getRandomItem();

        // REQUIREMENT #2 - Iterator Pattern
        // After battle, have chance to get items from treasure chest.
        System.out.println(
            "You open the treasure chest and find several " + randomTreasure.getType() + "!");
        System.out.println("You equip yourself with " + randomTreasure + "!");
        var extraHealth = faker.number().numberBetween(1, 1000);
        var extraStrength = faker.number().numberBetween(1, 50);
        System.out.println("This gives you a +" + extraHealth + " to your Health!");
        System.out.println("This also gives you a +" + extraStrength + " to your Strength!");

        hero.setHealth(hero.getHealth() + extraHealth);
        hero.setStrength(hero.getStrength() + extraStrength);

        Weapon randomWeapon = Weapon.getRandomWeapon();
        System.out.println(
            "Because this is make believe and I'm horrible at story lines, you get a "
                + randomWeapon + ", too!");
        System.out.println("You equip yourself with " + randomWeapon + "!");
        hero.setWeaponPrimary(randomWeapon);


        currentStats(hero);
        count++;

        if (count == 30) {
          wonGameOutput();
          currentStats(hero);
          gameWon = true;
          break;
        }
      }
    }

    if (!gameWon) {
      System.out.println("You're dead. Game over. Go study SER 316.");
    }


  }

  private static void beginGameOutput() {
    System.out.println("------------------------------------------------------");
    System.out.println("---------------╔══════════════════════╗---------------");
    System.out.println("---------------║                      ║---------------");
    System.out.println("---------------║ LETS BEGIN THE GAME! ║---------------");
    System.out.println("---------------║                      ║---------------");
    System.out.println("---------------╚══════════════════════╝---------------");
    System.out.println("------------------------------------------------------");
  }

  private static void wonGameOutput() {
    System.out.println("----------------------------------------------------");
    System.out.println("-----------╔════════════════════════════╗-----------");
    System.out.println("-----------║                            ║-----------");
    System.out.println("-----------║ YOU HAVE REACHED FLOOR 30! ║-----------");
    System.out.println("-----------║                            ║-----------");
    System.out.println("-----------╚════════════════════════════╝-----------");
    System.out.println("-----╔════════════════════════════════════════╗-----");
    System.out.println("-----║                                        ║-----");
    System.out.println("-----║ AND WON THIS GAME THAT MAKES NO SENSE! ║-----");
    System.out.println("-----║                                        ║-----");
    System.out.println("-----╚════════════════════════════════════════╝-----");
    System.out.println("----------------------------------------------------");
  }

  private static void currentStats(Hero hero) {
    System.out.println("-----------------------------------------------------");
    System.out.println("---------------╔═════════════════════╗---------------");
    System.out.println("---------------║                     ║---------------");
    System.out.println("---------------║ YOUR CURRENT STATS! ║---------------");
    System.out.println("---------------║                     ║---------------");
    System.out.println("---------------╚═════════════════════╝---------------");
    System.out.println("-----------------------------------------------------");
    System.out.println(hero.toString());
  }

  private static void treasureItemsOutput(TreasureItemTypes treasureItemTypes) {
    System.out.println();
    System.out.println("------------------------------------------------");
    System.out.println("---------------╔════════════════╗---------------");
    System.out.println("---------------║                ║---------------");
    System.out.println("---------------║ Treasure Items:║---------------");
    System.out.println("---------------║                ║---------------");
    System.out.println("---------------╚════════════════╝---------------");
    System.out.println("------------------------------------------------");
    System.out.println(": " + treasureItemTypes);
  }

  private static class HealthBar {
    private static final String HEALTH_BAR = "Health: ";
    private static final String HEALTH_PERCENTAGE = "Health %: ";

    public static String getHealthBarPercentage(double initialHealth, double currentHealth) {
      return HEALTH_PERCENTAGE + String.format("%.2f", ((currentHealth) / initialHealth) * 100);
    }

    public static double getHealthBarPercentageDouble(double initialHealth, double currentHealth) {
      return (currentHealth / initialHealth) * 100;
    }

    public static String getHealthBar(int initialHealth, int currentHealth) {
      return HEALTH_BAR + currentHealth + "/" + initialHealth;
    }
  }
}

