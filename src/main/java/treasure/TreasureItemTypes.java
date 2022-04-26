package treasure;

import java.util.Random;

public enum TreasureItemTypes {

  COINS, GEMS, POTIONS, RINGS, RODS, SCROLLS, WANDS, WEAPONS;
  static final Random r = new Random();

  public static TreasureItemTypes getRandomTreasure() {
    return values()[r.nextInt(values().length)];
  }
}

//  public static TreasureItemTypes getRandomWeapon() {
//    final int randomIndex =
//        random.nextInt(values().length); // return a value of 0..values().legnth - 1);
//    return values()[randomIndex];
//  }

//}
