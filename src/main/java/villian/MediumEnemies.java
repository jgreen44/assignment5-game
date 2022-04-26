package villian;


/**
 * The type Medium enemies.
 */
public class MediumEnemies implements Enemies {

  private final Enemies decorated;


  public MediumEnemies(Enemies decorated) {
    this.decorated = decorated;
  }

  @Override
  public void attack() {
    decorated.attack();
    System.out.println();
  }

  @Override
  public int getEnemyPower() {
    return decorated.getEnemyPower() + 100;
  }

  @Override
  public void retreatBattle() {
    decorated.retreatBattle();
  }
}
