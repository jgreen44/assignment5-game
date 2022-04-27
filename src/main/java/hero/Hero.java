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
  private double heightFeet;
  private double heightInches;
  private int mana;
  private int strength;
  private int agility;
  private int intelligence;
  private int luck;
  private int level;
  private int experience;
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

  public CharacterType getCharacterType() {
    return characterType;
  }

  public String getName() {
    return name;
  }

  public HairColor getHairColor() {
    return hairColor;
  }

  public HairType getHairType() {
    return hairType;
  }

  public Weapon getWeaponPrimary() {
    return weaponPrimary;
  }

  public void setWeaponPrimary(Weapon weaponPrimary) {
    this.weaponPrimary = weaponPrimary;
  }

  public Weapon getWeapon2nd() {
    return weapon2nd;
  }

  public void setWeapon2nd(Weapon weapon2nd) {
    this.weapon2nd = weapon2nd;
  }

  public Weapon getWeapon3rd() {
    return weapon3rd;
  }

  public void setWeapon3rd(Weapon weapon3rd) {
    this.weapon3rd = weapon3rd;
  }

  public double getHeightFeet() {
    return heightFeet;
  }

  public void setHeightFeet(double heightFeet) {
    this.heightFeet = heightFeet;
  }

  public double getHeightInches() {
    return heightInches;
  }

  public void setHeightInches(double heightInches) {
    this.heightInches = heightInches;
  }

  public Armor getArmor() {
    return armor;
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

  public void setMana(int mana) {
    this.mana = mana;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getAgility() {
    return agility;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public int getLuck() {
    return luck;
  }

  public void setLuck(int luck) {
    this.luck = luck;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  @Override
  public String toString() {
    return "Your random hero is a: "
        + characterType + "\n"
        + "Name: " + name + "\n"
        + "Height: " + heightFeet + " feet, "
        + heightInches + " inches\n"
        + "Hair Type: " + hairType + "\n"
        + "Hair Color: " + hairColor + "\n"
        + "Armor: " + armor + "\n"
        + "Weapon 1: " + weaponPrimary + "\n"
        + "Weapon 2: " + weapon2nd + "\n"
        + "Weapon 3: " + weapon3rd + "\n"
        + "Health: " + health + "\n"
        + "Mana: " + mana + "\n"
        + "Strength: " + strength + "\n"
        + "Agility: " + agility + "\n"
        + "Intelligence: " + intelligence + "\n"
        + "Luck: " + luck + "\n"
        + "Level: " + level + "\n"
        + "Experience: " + experience + "\n";
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

