/*
Player (12 tasks)
  🔳 - private instance vars for int health, int kickStrength, int punchStrength, int enemiesDefeated, Room currentRoom, Item backpack
  ✅ + NoArgsConstructor
  🔳 + int getEnemiesDefeated // ALLEN
  🔳 + int getHealth // ALLEN
  🔳 + int getKickStrength // ALLEN
  🔳 + int getPunchStrength // TONY
  🔳 + Room getCurrentRoom // TONY
  🔳 + Item getBackpack // TONY
  🔳 + void increaseEnemiesDefeated() // increases by 1 // JHANYA
  🔳 + void loseHealth(int damage) // reduces health by damage // JHANYA
  🔳 + void setCurrentRoom(Room newRoom) // JHANYA
  🔳 + void setBackpack(Item newItem) // HASIKA
  🔳 + toString() // returns all the player stats // HASIKA
*/
public class Player
{
    // private instance vars go here
	private int health;
    private int kickStrength;
    private int punchStrength;
    private int enemiesDefeated;
    private Room currentRoom;
	private Item backpack;

    public Player()
    {
        health = 100;
        kickStrength = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
        punchStrength = 13 - kickStrength;
        enemiesDefeated = 0;
        currentRoom = null;
        backpack = null;
    }

    // methods go down here

public int getEnemiesDefeated() {
    return enemiesDefeated;
}


public int getHealth() {
    return health;
}


public int getKickStrength() {
    return kickStrength;
}
public int getPunchStrength(){
     return punchStrength;
}

public Room getCurrentRoom(){
     return currentRoom;
}

public Item getBackpack(){
     return backpack;
}


public void increaseEnemiesDefeated() {
   enemiesDefeated += 1;
}

public void loseHealth(int damage) {
  health = health - damage;
}

public void setCurrentRoom(Room newRoom) {
  this.currentRoom = newRoom;
}

public void setBackpack(Item newItem){
        this.backpack = newItem;
    }


    public String toString()
    {
      // to do
      return this.health + " " + this.kickStrength + " " + this.punchStrength + " " + this.enemiesDefeated + " " + this.currentRoom + " " + this.backpack;
    }
}
