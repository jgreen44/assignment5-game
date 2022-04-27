package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import hero.HairColor;
import org.junit.jupiter.api.Test;

class HairColorTest {

  @Test
  void testToString() {
    assertEquals("Green", HairColor.GREEN.toString());
  }
}