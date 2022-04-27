package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hero.Weapon;
import org.junit.jupiter.api.Test;

class WeaponTest {

  @Test
  void getName() {
    assertEquals("Net", Weapon.NET.getName());
  }

  @Test
  void getDamage() {
    assertEquals(5200, Weapon.NET.getDamage());
  }

  @Test
  void testToString() {
    assertEquals("Net causing damage of: 5200", Weapon.NET.toString());
  }
}