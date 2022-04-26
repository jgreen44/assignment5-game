package hero;


/**
 * The type Hero.
 */
public final class Hero {

  private final CharacterType characterType;
  private final String name;
  private final HairType hairType;
  private final HairColor hairColor;
  private final Armor armor;
  private final double heightFeet;
  private final double heightInches;
  private final int mana;
  private final int strength;
  private final int agility;
  private final int intelligence;
  private final int luck;
  private final int level;
  private final int experience;
  private Weapon weapon2nd;
  private Weapon weapon3rd;
  private Weapon weaponPrimary;
  private int health;


  private Hero(Builder builder) {
    this.characterType = builder.characterType;
    this.name = builder.name;
    this.hairColor = builder.hairColor;
    this.hairType = builder.hairType;
    this.weaponPrimary = builder.weaponPrimary;
    this.weapon2nd = builder.weapon2nd;
    this.weapon3rd = builder.weapon3rd;
    this.heightFeet = builder.heightFeet;
    this.heightInches = builder.heightInches;
    this.armor = builder.armor;
    this.health = builder.health;
    this.mana = builder.mana;
    this.strength = builder.strength;
    this.agility = builder.agility;
    this.intelligence = builder.intelligence;
    this.luck = builder.luck;
    this.level = builder.level;
    this.experience = builder.experience;
  }

  public CharacterType getProfession() {
    return characterType;
  }

  public String getName() {
    return name;
  }

  public HairType getHairType() {
    return hairType;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  public Armor getArmor() {
    return armor;
  }

  public double getHeightFeet() {
    return heightFeet;
  }

  public double getHeightInches() {
    return heightInches;
  }

  public Weapon getWeaponPrimary() {
    return weaponPrimary;
  }

  public Weapon setWeaponPrimary(Weapon weaponPrimary) {
    return this.weaponPrimary = weaponPrimary;
  }

  public Weapon getWeapon2nd() {
    return weapon2nd;
  }

  public Weapon setWeapon2nd(Weapon weapon2nd) {
    return this.weapon2nd = weapon2nd;
  }

  public Weapon getWeapon3rd() {
    return weapon3rd;
  }

  public Weapon setWeapon3rd(Weapon weapon3rd) {
    return this.weapon3rd = weapon3rd;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getMana() {
    return mana;
  }

  public int getStrength() {
    return strength;
  }

  public int getAgility() {
    return agility;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getLuck() {
    return luck;
  }

  public int getLevel() {
    return level;
  }

  public int getExperience() {
    return experience;
  }


  @Override
  public String toString() {

    var stringBuilder = new StringBuilder();
    stringBuilder
        .append("Your random hero is a: ").append(characterType).append("\n")
        .append("Name: ").append(name).append("\n")
        .append("Height: ").append(heightFeet).append(" feet, ")
        .append(heightInches).append(" inches\n")
        .append("Hair Type: ").append(hairType).append("\n")
        .append("Hair Color: ").append(hairColor).append("\n")
        .append("Armor: ").append(armor).append("\n")
        .append("Weapon 1: ").append(weaponPrimary).append("\n")
        .append("Weapon 2: ").append(weapon2nd).append("\n")
        .append("Weapon 3: ").append(weapon3rd).append("\n")
        .append("Health: ").append(health).append("\n")
        .append("Mana: ").append(mana).append("\n")
        .append("Strength: ").append(strength).append("\n")
        .append("Agility: ").append(agility).append("\n")
        .append("Intelligence: ").append(intelligence).append("\n")
        .append("Luck: ").append(luck).append("\n")
        .append("Level: ").append(level).append("\n")
        .append("Experience: ").append(experience).append("\n");
    return stringBuilder.toString();
  }

  /**
   * The type Builder.
   */
  public static class Builder {

    private CharacterType characterType;
    private String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weaponPrimary;
    private Weapon weapon2nd;
    private Weapon weapon3rd;
    private double heightFeet;
    private double heightInches;
    private int health;
    private int mana;
    private int strength;
    private int agility;
    private int level;
    private int intelligence;
    private int luck;
    private int experience;


    public Builder() {
    }

    public Builder characterType(CharacterType characterType) {
      this.characterType = characterType;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder hairType(HairType hairType) {
      this.hairType = hairType;
      return this;
    }

    public Builder hairColor(HairColor hairColor) {
      this.hairColor = hairColor;
      return this;
    }

    public Builder heightInFeet(double heightFeet) {
      this.heightFeet = heightFeet;
      return this;
    }

    public Builder heightInInches(double heightInches) {
      this.heightInches = heightInches;
      return this;
    }

    public Builder armor(Armor armor) {
      this.armor = armor;
      return this;
    }

    public Builder weapon(Weapon weapon) {
      this.weaponPrimary = weapon;
      return this;
    }

    public Builder weapon2nd(Weapon weapon) {
      this.weapon2nd = weapon;
      return this;
    }

    public Builder weapon3rd(Weapon weapon) {
      this.weapon3rd = weapon;
      return this;
    }

    public Builder health(int health) {
      this.health = health;
      return this;
    }

    public Builder mana(int mana) {
      this.mana = mana;
      return this;
    }

    public Builder strength(int strength) {
      this.strength = strength;
      return this;
    }

    public Builder agility(int agility) {
      this.agility = agility;
      return this;
    }

    public Builder intelligence(int intelligence) {
      this.intelligence = intelligence;
      return this;
    }

    public Builder luck(int luck) {
      this.luck = luck;
      return this;
    }

    public Builder level(int level) {
      this.level = level;
      return this;
    }

    public Builder experience(int experience) {
      this.experience = experience;
      return this;
    }

    public Hero build() {
      return new Hero(this);
    }
  }
}

