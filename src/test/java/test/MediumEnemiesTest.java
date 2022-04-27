package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import villian.MediumEnemies;
import villian.SmallEnemies;


class MediumEnemiesTest {
  SmallEnemies smallEnemies = new SmallEnemies();
  MediumEnemies mediumEnemies = new MediumEnemies(smallEnemies);

  @Test
  public void getEnemyPower() {
    assertEquals(150, mediumEnemies.getEnemyPower());
  }
}