package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javafaker.Faker;
import hero.Armor;
import hero.CharacterType;
import hero.HairColor;
import hero.HairType;
import hero.Hero;
import hero.Weapon;
import org.junit.jupiter.api.Test;


class HeroTest {

  Faker faker = new Faker();
  Hero hero = new Hero.Builder()
      .characterType(CharacterType.SORCERER)// random character type
      .name("Jason")
      .heightInFeet(5)
      .heightInInches(8)
      .hairType(HairType.STRAIGHT) // hair type
      .hairColor(HairColor.BLOND)
      .armor(Armor.FULL_PLATE) // armor
      .weapon(Weapon.LONGSWORD)  // weapon 1
      .weapon2nd(Weapon.HAND_AXE)  // weapon 2
      .weapon3rd(Weapon.BATTLEAXE)  // weapon 3
      .health(100)  // health
      .mana(100) //  mana
      .strength(100)  // strength
      .agility(100)  // agility
      .intelligence(100) // intelligence
      .luck(100)// luck
      .level(100) // level
      .experience(100) // experience
      .build();

  String heroString = "Your random hero is a: "
      + "Sorcerer\n"
      + "Name: Jason\n"
      + "Height: 5.0 feet, "
      + "8.0 inches\n"
      + "Hair Type: Straight\n"
      + "Hair Color: Blond\n"
      + "Armor: Full Plate\n"
      + "Weapon 1: Longsword causing damage of: 2100\n"
      + "Weapon 2: Hand Axe causing damage of: 300\n"
      + "Weapon 3: Battle Axe causing damage of: 1400\n"
      + "Health: 100\n"
      + "Mana: 100\n"
      + "Strength: 100\n"
      + "Agility: 100\n"
      + "Intelligence: 100\n"
      + "Luck: 100\n"
      + "Level: 100\n"
      + "Experience: 100\n";

  @Test
  void getCharacterType() {

    assertEquals("Sorcerer", hero.getCharacterType().toString());
  }

  @Test
  void getName() {
    assertEquals("Jason", hero.getName());
  }

  @Test
  void getHairColor() {
    assertEquals("Blond", hero.getHairColor().toString());
  }

  @Test
  void getHairType() {
    assertEquals("Straight", hero.getHairType().toString());
  }

  @Test
  void getWeaponPrimary() {
    assertEquals("Longsword causing damage of: 2100", hero.getWeaponPrimary().toString());
  }

  @Test
  void getWeapon2nd() {
    assertEquals("Hand Axe causing damage of: 300", hero.getWeapon2nd().toString());
  }

  @Test
  void getWeapon3rd() {
    assertEquals("Battle Axe causing damage of: 1400", hero.getWeapon3rd().toString());
  }

  @Test
  void getHeightFeet() {
    assertEquals(5, hero.getHeightFeet());
  }

  @Test
  void getHeightInches() {
    assertEquals(8, hero.getHeightInches());
  }

  @Test
  void getArmor() {
    assertEquals("Full Plate", hero.getArmor().toString());
  }

  @Test
  void getHealth() {
    assertEquals(100, hero.getHealth());
  }

  @Test
  void getMana() {
    assertEquals(100, hero.getMana());
  }

  @Test
  void getStrength() {
    assertEquals(100, hero.getStrength());
  }

  @Test
  void getAgility() {
    assertEquals(100, hero.getAgility());
  }

  @Test
  void getIntelligence() {
    assertEquals(100, hero.getIntelligence());
  }

  @Test
  void getLuck() {
    assertEquals(100, hero.getLuck());
  }

  @Test
  void getLevel() {
    assertEquals(100, hero.getLevel());
  }

  @Test
  void getExperience() {
    assertEquals(100, hero.getExperience());
  }

  @Test
  void testToString() {
    assertEquals(heroString, hero.toString());
  }
}