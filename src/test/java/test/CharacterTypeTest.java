package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hero.CharacterType;
import org.junit.jupiter.api.Test;

class CharacterTypeTest {

  @Test
  void testToString() {
    assertEquals("Barbarian", CharacterType.BARBARIAN.toString());
  }
}