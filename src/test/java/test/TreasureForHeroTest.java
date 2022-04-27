package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import treasure.Item;
import treasure.TreasureChestItemIterator;
import treasure.TreasureForHero;
import treasure.TreasureItemTypes;

class TreasureForHeroTest {
  /**
   * Create a list of all expected items in the chest.
   *
   * @return The set of all expected items in the chest
   */
  public static List<Object[]> dataProvider() {
    return List.of(
        new Object[] {new Item(TreasureItemTypes.COINS, "Blue coin")},
        new Object[] {new Item(TreasureItemTypes.COINS, "Red coin")},
        new Object[] {new Item(TreasureItemTypes.COINS, "Yellow coin")},
        new Object[] {new Item(TreasureItemTypes.COINS, "Magic coin")},
        new Object[] {new Item(TreasureItemTypes.COINS, "Green coin")},
        new Object[] {new Item(TreasureItemTypes.GEMS, "Azurite gem")},
        new Object[] {new Item(TreasureItemTypes.GEMS, "Obsidian gem")},
        new Object[] {new Item(TreasureItemTypes.GEMS, "Peridot gem")},
        new Object[] {new Item(TreasureItemTypes.GEMS, "Zircon gem")},
        new Object[] {new Item(TreasureItemTypes.GEMS, "Saltwater pearl gem")},
        new Object[] {new Item(TreasureItemTypes.POTIONS, "Guidance potion")},
        new Object[] {new Item(TreasureItemTypes.POTIONS, "Stabilize potion")},
        new Object[] {new Item(TreasureItemTypes.POTIONS, "Cure light wounds potion")},
        new Object[] {new Item(TreasureItemTypes.POTIONS, "Cloak of the shade potion")},
        new Object[] {new Item(TreasureItemTypes.POTIONS, "Vanish potion")},
        new Object[] {new Item(TreasureItemTypes.RINGS, "Ring of maniacal devices")},
        new Object[] {new Item(TreasureItemTypes.RINGS, "Ring of mind shielding")},
        new Object[] {new Item(TreasureItemTypes.RINGS, "Lesser ring of revelation")},
        new Object[] {new Item(TreasureItemTypes.RINGS, "Ring of transposition")},
        new Object[] {new Item(TreasureItemTypes.RINGS, "Ring of craft magic")},
        new Object[] {new Item(TreasureItemTypes.RODS, "Rod of cancellation")},
        new Object[] {new Item(TreasureItemTypes.RODS, "Rod of the python")},
        new Object[] {new Item(TreasureItemTypes.RODS, "Fiery nimbus rod")},
        new Object[] {new Item(TreasureItemTypes.RODS, "Rod of steadfast resolve")},
        new Object[] {new Item(TreasureItemTypes.RODS, "Rod of shadows")},
        new Object[] {new Item(TreasureItemTypes.SCROLLS, "Mending scroll")},
        new Object[] {new Item(TreasureItemTypes.SCROLLS, "Read magic scroll")},
        new Object[] {new Item(TreasureItemTypes.SCROLLS, "Message scroll")},
        new Object[] {new Item(TreasureItemTypes.SCROLLS, "Burning hands scroll")},
        new Object[] {new Item(TreasureItemTypes.SCROLLS, "Shocking grasp scroll")},
        new Object[] {new Item(TreasureItemTypes.WANDS, "Touch of fatigue spell")},
        new Object[] {new Item(TreasureItemTypes.WANDS, "Bleed spell")},
        new Object[] {new Item(TreasureItemTypes.WANDS, "Resistance spell")},
        new Object[] {new Item(TreasureItemTypes.WANDS, "Color spray spell")},
        new Object[] {new Item(TreasureItemTypes.WANDS, "Expeditious retreat spell")},
        new Object[] {new Item(TreasureItemTypes.WEAPONS, "Dagger")},
        new Object[] {new Item(TreasureItemTypes.WEAPONS, "Light crossbow")},
        new Object[] {new Item(TreasureItemTypes.WEAPONS, "Longbow")},
        new Object[] {new Item(TreasureItemTypes.WEAPONS, "Scythe")},
        new Object[] {new Item(TreasureItemTypes.WEAPONS, "Whip")}
    );
  }

  /**
   * Test if the expected item can be retrieved from the chest using the {@link
   * TreasureChestItemIterator}
   */
  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testIterator(Item expectedItem) {
    final var chest = new TreasureForHero();
    final var iterator = chest.iterator(expectedItem.getType());
    assertNotNull(iterator);

    while (iterator.hasNext()) {
      final var item = iterator.next();
      assertNotNull(item);
      assertEquals(expectedItem.getType(), item.getType());

      final var name = item.toString();
      assertNotNull(name);
      if (expectedItem.toString().equals(name)) {
        return;
      }
    }

    fail("Expected to find item [" + expectedItem + "] using iterator, but we didn't.");

  }


  @ParameterizedTest
  @MethodSource("dataProvider")
  public void testGetItems(Item expectedItem) throws Exception {
    final var chest = new TreasureForHero();
    final var items = chest.getItems();
    assertNotNull(items);

    for (final var item : items) {
      assertNotNull(item);
      assertNotNull(item.getType());
      assertNotNull(item.toString());

      final var sameType = expectedItem.getType() == item.getType();
      final var sameName = expectedItem.toString().equals(item.toString());
      if (sameType && sameName) {
        return;
      }
    }

    fail("Expected to find item [" + expectedItem + "] in the item list, but we didn't.");

  }
}