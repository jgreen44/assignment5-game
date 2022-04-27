package villian;

/**
 * The type Boss enemies.
 */
public class BossEnemies implements Enemies {

  private final Enemies decorated;


  public BossEnemies(Enemies decorated) {
    this.decorated = decorated;
  }

  @Override
  public void attack() {
    decorated.attack();
    System.out.println("The boss enemy swings with a sword!");
  }

  @Override
  public int getEnemyPower() {
    return decorated.getEnemyPower() + 500;
  }

  @Override
  public void retreatBattle() {
    decorated.retreatBattle();
  }
}
