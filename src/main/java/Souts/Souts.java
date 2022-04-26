package Souts;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Souts {

  private final Random random;
  Map<String, String> map = new HashMap<String, String>();
  String buildingCharacter = "We are currently building our your character. Please wait.....\n";
  String buildingCharacter02 = "this is a test for build char 2";

  public Souts() {
    map.put("building_character", buildingCharacter);
    map.put("building_character_02", buildingCharacter02);
    random = new Random();
  }

  public Map<String, String> getMap() {
    return map;
  }

  public boolean getRandomTrueFalse() {
    return random.nextBoolean();
  }

  public int getRandom100() {
    return random.nextInt(100);
  }

  public int getRandom50() {
    return random.nextInt(50);
  }

  public int getRandom10() {
    return random.nextInt(10);
  }


}
