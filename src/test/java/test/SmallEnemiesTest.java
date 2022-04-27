package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import villian.SmallEnemies;


class SmallEnemiesTest {

  SmallEnemies smallEnemies = new SmallEnemies();

  @Test
  public void getEnemyPower() {
    assertEquals(50, smallEnemies.getEnemyPower());
  }

}