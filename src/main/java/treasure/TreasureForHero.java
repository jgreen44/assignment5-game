package treasure;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * The type Treasure for hero.
 */
public class TreasureForHero {


  private static final Random random = new Random();
  private static List<Item> items = null;

  /**
   * Instantiates a new Treasure for hero.
   */
  @SuppressFBWarnings("ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD")
  public TreasureForHero() {

    items = List.of(
        new Item(TreasureItemTypes.COINS, "Blue coin"),
        new Item(TreasureItemTypes.COINS, "Red coin"),
        new Item(TreasureItemTypes.COINS, "Yellow coin"),
        new Item(TreasureItemTypes.COINS, "Magic coin"),
        new Item(TreasureItemTypes.COINS, "Green coin"),
        new Item(TreasureItemTypes.GEMS, "Azurite gem"),
        new Item(TreasureItemTypes.GEMS, "Obsidian gem"),
        new Item(TreasureItemTypes.GEMS, "Peridot gem"),
        new Item(TreasureItemTypes.GEMS, "Zircon gem"),
        new Item(TreasureItemTypes.GEMS, "Saltwater pearl gem"),
        new Item(TreasureItemTypes.POTIONS, "Guidance potion"),
        new Item(TreasureItemTypes.POTIONS, "Stabilize potion"),
        new Item(TreasureItemTypes.POTIONS, "Cure light wounds potion"),
        new Item(TreasureItemTypes.POTIONS, "Cloak of the shade potion"),
        new Item(TreasureItemTypes.POTIONS, "Vanish potion"),
        new Item(TreasureItemTypes.RINGS, "Ring of maniacal devices"),
        new Item(TreasureItemTypes.RINGS, "Ring of mind shielding"),
        new Item(TreasureItemTypes.RINGS, "Lesser ring of revelation"),
        new Item(TreasureItemTypes.RINGS, "Ring of transposition"),
        new Item(TreasureItemTypes.RINGS, "Ring of craft magic"),
        new Item(TreasureItemTypes.RODS, "Rod of cancellation"),
        new Item(TreasureItemTypes.RODS, "Rod of the python"),
        new Item(TreasureItemTypes.RODS, "Fiery nimbus rod"),
        new Item(TreasureItemTypes.RODS, "Rod of steadfast resolve"),
        new Item(TreasureItemTypes.RODS, "Rod of shadows"),
        new Item(TreasureItemTypes.SCROLLS, "Mending scroll"),
        new Item(TreasureItemTypes.SCROLLS, "Read magic scroll"),
        new Item(TreasureItemTypes.SCROLLS, "Message scroll"),
        new Item(TreasureItemTypes.SCROLLS, "Burning hands scroll"),
        new Item(TreasureItemTypes.SCROLLS, "Shocking grasp scroll"),
        new Item(TreasureItemTypes.WANDS, "Touch of fatigue spell"),
        new Item(TreasureItemTypes.WANDS, "Bleed spell"),
        new Item(TreasureItemTypes.WANDS, "Resistance spell"),
        new Item(TreasureItemTypes.WANDS, "Color spray spell"),
        new Item(TreasureItemTypes.WANDS, "Expeditious retreat spell"),
        new Item(TreasureItemTypes.WEAPONS, "Dagger"),
        new Item(TreasureItemTypes.WEAPONS, "Light crossbow"),
        new Item(TreasureItemTypes.WEAPONS, "Longbow"),
        new Item(TreasureItemTypes.WEAPONS, "Scythe"),
        new Item(TreasureItemTypes.WEAPONS, "Whip")
    );
  }

  @SuppressFBWarnings("DMI_RANDOM_USED_ONLY_ONCE")
  public static Item getRandomItem() {
    int index = random.nextInt(items.size());
    return items.get(index);
  }

  public Iterator<Item> iterator(TreasureItemTypes treasureItemTypes) {
    return new TreasureChestItemIterator(this, treasureItemTypes);
  }

  public List<Item> getItems() {
    return new ArrayList<>(items);
  }
}
