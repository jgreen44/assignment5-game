package treasure;


public class Item {

  private final String name;
  private TreasureItemTypes type;


  public Item(TreasureItemTypes type, String name) {
    this.setType(type);
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }


  public TreasureItemTypes getType() {
    return type;
  }


  public final void setType(TreasureItemTypes type) {
    this.type = type;
  }
}
