package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hero.HairType;
import org.junit.jupiter.api.Test;

class HairTypeTest {

  @Test
  void testToString() {
    assertEquals("Straight", HairType.STRAIGHT.toString());
  }
}