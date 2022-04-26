package villian;


public class SmallEnemies implements Enemies {

  @Override
  public void attack() {
    System.out.println("The enemy charges with fists flying!");
  }

  @Override
  public int getEnemyPower() {
    return 50;
  }

  @Override
  public void retreatBattle() {
    System.out.println("The enemy runs away!");
  }
}
