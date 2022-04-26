package treasure;

import java.util.List;

/**
 * The type Treasure chest item iterator.
 */
public class TreasureChestItemIterator implements Iterator<Item> {
  private final TreasureForHero treasureForHero;
  private final TreasureItemTypes type;
  private int index;


  /**
   * Instantiates a new Treasure chest item iterator.
   *
   * @param treasure the treasure
   * @param type     the type
   */
  public TreasureChestItemIterator(TreasureForHero treasure, TreasureItemTypes type) {
    this.treasureForHero = treasure;
    this.type = type;
    this.index = -1;
  }

  @Override
  public boolean hasNext() {
    return getNextIndex() != -1;
  }

  @Override
  public Item next() {
    index = getNextIndex();
    if (index != -1) {
      return treasureForHero.getItems().get(index);
    }
    return null;
  }

  private int getNextIndex() {
    List<Item> items = treasureForHero.getItems();
    int tempIndex = index;
    while (true) {
      tempIndex++;
      if (tempIndex >= items.size()) {
        tempIndex = -1;
        break;
      }
      if (items.get(tempIndex).getType().equals(type)) {
        break;
      }
    }
    return tempIndex;
  }

  public void remove() {
    treasureForHero.getItems().remove(index);
  }

//  @Override
//  public void remove() {
//    if (index != -1) {
//      treasureForHero.getItems().remove(index);
//      index = -1;
//    }
//  }
}
