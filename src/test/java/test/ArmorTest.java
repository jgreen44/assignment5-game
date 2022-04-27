package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hero.Armor;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

class ArmorTest {


  @Test
  @Description("Test armor's name")
  void testToString() {
    assertEquals("Chain Mail", Armor.CHAIN_MAIL.toString());
  }
}