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
  }

  /**
   * Program entry point.
   *
   * @param args command line args
   */

  public static void main(String[] args) {

    int count = 1;
    boolean smallEnemy = false;
    boolean mediumEnemy = false;


    Faker faker = new Faker();
    String heroName = faker.name().firstName();

    System.out.println("Building your random character...please wait.....");
    var hero = new Hero.Builder(CharacterType.getRandomCharacterType(),
        heroName) // character type and name
        .getHeightFeet(faker.number().numberBetween(3, 8))
        .getHeightInches(faker.number().numberBetween(0, 11))
        .getHairType(HairType.getRandomHairType()) // hair type
        .getHairColor(HairColor.getRadonHairColor())
        .getArmor(Armor.getRandomArmor()) // armor
        .getWeapon(Weapon.getRandomWeapon())  // weapon
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

    while (hero.getHealth() > 0) {

      System.out.println("\nRoom " + count);

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
      } else {
        System.out.println("You got away! Consider yourself lucky! Go buy a lottery ticket.");
      }


      // get treasure
      System.out.println("Because you won the battle, ");
      smallEnemy = false;
      mediumEnemy = false;

      count++;
    }

    System.out.println("You're dead. Game over. Go study SER 316.");


//    // simple troll
//    System.out.println("A simple looking troll approaches.");
//    var troll = new SmallEnemies();
//    troll.attack();
//    troll.fleeBattle();
//    System.out.println("Simple troll power: " + troll.getAttackPower());
//
//
//    // change the behavior of the simple troll by adding a decorator
//    System.out.println("A troll with huge club surprises you.");
//    var clubbedTroll = new MediumEnemies(troll);
//    clubbedTroll.attack();
//    clubbedTroll.fleeBattle();
//    System.out.println("Clubbed troll power: " + clubbedTroll.getAttackPower());


//    var mage = new Hero.Builder(CharacterType.BARBARIAN, heroName).getHairColor(HairColor.BLACK)
//        .getWeapon(Weapon.BATTLEAXE).build();
//    System.out.println(mage.toString());
//
//    var warrior = new Hero.Builder(CharacterType.BARD, heroName).getHairColor(HairColor.BLOND)
//        .getHairType(HairType.SHORT_AND_CURLY).getArmor(Armor.CHAIN_MAIL).getWeapon(Weapon.HAND_AXE)
//        .build();
//    System.out.println(warrior.toString());
//
//    var thief = new Hero.Builder(CharacterType.CLERIC, heroName).getHairType(HairType.CURLY)
//        .getWeapon(Weapon.LONGSWORD).build();
//    System.out.println(thief.toString());

    demonstrateTreasureChestIteratorForType(COINS);
    demonstrateTreasureChestIteratorForType(GEMS);
    demonstrateTreasureChestIteratorForType(POTIONS);
    demonstrateTreasureChestIteratorForType(RINGS);
    demonstrateTreasureChestIteratorForType(RODS);
    demonstrateTreasureChestIteratorForType(SCROLLS);
    demonstrateTreasureChestIteratorForType(WANDS);
    demonstrateTreasureChestIteratorForType(WEAPONS);


  }


}
