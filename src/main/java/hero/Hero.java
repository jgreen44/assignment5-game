package hero;


public final class Hero {

  private final CharacterType characterType;
  private final String name;
  private final HairType hairType;
  private final HairColor hairColor;
  private final Armor armor;
  private final Weapon weapon;
  private final double heightFeet;
  private final double heightInches;
  private final int mana;
  private final int strength;
  private final int agility;
  private final int intelligence;
  private final int luck;
  private final int level;
  private final int experience;
  private int health;


  private Hero(Builder builder) {
    this.characterType = builder.characterType;
    this.name = builder.name;
    this.hairColor = builder.hairColor;
    this.hairType = builder.hairType;
    this.weapon = builder.weapon;
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

  public Weapon getWeapon() {
    return weapon;
  }

  public int getHealth() {
    return health;
  }

  public int setHealth(int health) {
    return this.health = health;
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

    var sb = new StringBuilder();
    sb
        .append("Your random hero is a: ").append(characterType).append("\n")
        .append("Name: ").append(name).append("\n")
        .append("Height: ").append(heightFeet).append(" feet, ")
        .append(heightInches).append(" inches\n")
        .append("Hair Type: ").append(hairType).append("\n")
        .append("Hair Color: ").append(hairColor).append("\n")
        .append("Armor: ").append(armor).append("\n")
        .append("Weapon: ").append(weapon).append("\n")
        .append("Health: ").append(health).append("\n")
        .append("Mana: ").append(mana).append("\n")
        .append("Strength: ").append(strength).append("\n")
        .append("Agility: ").append(agility).append("\n")
        .append("Intelligence: ").append(intelligence).append("\n")
        .append("Luck: ").append(luck).append("\n")
        .append("Level: ").append(level).append("\n")
        .append("Experience: ").append(experience).append("\n");
    return sb.toString();
  }

  public static class Builder {

    private final CharacterType characterType;
    private final String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;
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

    public Builder(CharacterType characterType, String name) {
      this.characterType = characterType;
      this.name = name;
    }

    public Builder getHairType(HairType hairType) {
      this.hairType = hairType;
      return this;
    }

    public Builder getHairColor(HairColor hairColor) {
      this.hairColor = hairColor;
      return this;
    }

    public Builder getHeightFeet(double heightFeet) {
      this.heightFeet = heightFeet;
      return this;
    }

    public Builder getHeightInches(double heightInches) {
      this.heightInches = heightInches;
      return this;
    }

    public Builder getArmor(Armor armor) {
      this.armor = armor;
      return this;
    }

    public Builder getWeapon(Weapon weapon) {
      this.weapon = weapon;
      return this;
    }

    public Builder getHealth(int health) {
      this.health = health;
      return this;
    }

    public Builder getMana(int mana) {
      this.mana = mana;
      return this;
    }

    public Builder getStrength(int strength) {
      this.strength = strength;
      return this;
    }

    public Builder getAgility(int agility) {
      this.agility = agility;
      return this;
    }

    public Builder getIntelligence(int intelligence) {
      this.intelligence = intelligence;
      return this;
    }

    public Builder getLuck(int luck) {
      this.luck = luck;
      return this;
    }

    public Builder getLevel(int level) {
      this.level = level;
      return this;
    }

    public Builder getExperience(int experience) {
      this.experience = experience;
      return this;
    }

    public Hero build() {
      return new Hero(this);
    }
  }
}

