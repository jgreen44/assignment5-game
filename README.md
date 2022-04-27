## Rough Ideas for Design Patterns

Use the Builder pattern to create different types of enemies. Use Abstract factory to create different types of weapons
and health. Finally, use the Decorator pattern to add additional funcationality to enemies and self.

## Spotbugs HTML Screenshot

![image](https://user-images.githubusercontent.com/52048026/165600878-0394cbdf-748f-42d1-914a-70c7be3c56af.png)

## Checkstyle Report Screenshot

<img width="1385" alt="image" src="https://user-images.githubusercontent.com/52048026/165425623-6fe32e56-58ca-47ab-8009-0ca4d5b0a7a8.png">

## Junit Tests Screenshot

<img width="1034" alt="image" src="https://user-images.githubusercontent.com/52048026/165426180-a4be2dd5-3b4e-4ccf-8678-0ba67b443ae7.png">

## Jacoco Coverage Screenshot

### Note: Void methods were not tested since they do not return and mocking in Mockito is out of scope

=<img width="934" alt="image" src="https://user-images.githubusercontent.com/52048026/165425738-776ea34f-bcd9-46b5-84de-6767cd707c4f.png">

<img width="994" alt="image" src="https://user-images.githubusercontent.com/52048026/165425784-c9dee66d-7637-42f2-acf8-1f7fe3256c52.png">

<img width="894" alt="image" src="https://user-images.githubusercontent.com/52048026/165425841-f12be9b8-4388-4c35-9601-f2702b0246a1.png">

<img width="905" alt="image" src="https://user-images.githubusercontent.com/52048026/165425868-7be0db5f-c9e4-4734-97d1-336463faa358.png">

<img width="878" alt="image" src="https://user-images.githubusercontent.com/52048026/165425900-b347abe7-0a60-431b-86f8-ec9dc18b575b.png">

<img width="1047" alt="image" src="https://user-images.githubusercontent.com/52048026/165426044-536231b9-462a-490c-8a11-5ddb7a19dda5.png">

## Link to Screen Cast

https://user-images.githubusercontent.com/52048026/165436507-ca5eda3c-f016-4eb6-90d0-b4b96aea6d8f.mp4


## Design Pattern Explanation

1. Hero is using the Build Pattern.
   See [here](https://github.com/jgreen44/ser316-assignment5-game/blob/3fa7e15c91d2424fc08140913901f447cb22d4a3/src/test/java/test/HeroTest.java#L16-L16)
2. Villian is using the decorator pattern.
   See [here](https://github.com/jgreen44/ser316-assignment5-game/blob/3fa7e15c91d2424fc08140913901f447cb22d4a3/src/main/java/villian/SmallEnemies.java#L7-L7)
3. Treasure is using the Iterator pattern.
   See [here](https://github.com/jgreen44/ser316-assignment5-game/blob/3fa7e15c91d2424fc08140913901f447cb22d4a3/src/main/java/treasure/TreasureChestItemIterator.java#L19-L19)

## Requirement Fullfilled

- Requirement
  1: [Builder Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L58-L58):
  Create a random character class
- Requirement
  2: [Builder Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L69-L69):
  Create a random character minimum three unique weapon items
- Requirement
  3: [Builder Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L82-L82):
  Create a random character with skills

- Requirement
  1: [Decorator Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L98-L98):
  Encounter small enemy every floor, medium enemy every fifth floor, and boss every 10th floor
- Requirement
  2: [Decorator Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L117-L117):
  All enemies should get harder for each floor you travel to

- Requirement
  1: [Iterator Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L163-L163):
  Shop should sell 3 random objects.
- Requirement
  2: [Iterator Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L177-L177):
  After battle, have chance to get items from treasure chest.
- Requirement
  3: [Iterator Pattern](https://github.com/jgreen44/ser316-assignment5-game/blob/43ccf262c361e32c4cdf21cb17958694e390c112/src/main/java/Main.java#L150-L150):
  If health is below 15%, go to top floor.

gradle build demo
