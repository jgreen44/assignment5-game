package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import villian.BossEnemies;
import villian.SmallEnemies;

class BossEnemiesTest {
  SmallEnemies smallEnemies = new SmallEnemies();
  BossEnemies bossEnemies = new BossEnemies(smallEnemies);

  @Test
  @Description("Test for the BossEnemies Enemy Power Level")
  void getEnemyPower() {
    assertEquals(550, bossEnemies.getEnemyPower());
  }
}