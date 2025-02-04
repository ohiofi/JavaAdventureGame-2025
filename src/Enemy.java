


  /*
TO DO LIST:
Enemy extends Npc (7 tasks)
 + NoArgsConstructor
 + Enemy(String _name, String _description)
 + String getAttackName()
 + int getHealth
 + int getMagicWeakness()
 + void loseHealth(int h)
 + void setAttackName()
*/


/**
 * Represents an Npc that the player can fight.
 * Each Room can contain either an Npc or an Enemy.
 */
public class Enemy extends Npc
{
  // class variable
  /**
   * Tracks total number of enemies
   */
  private static int enemyCounter = 0;


  // class method
  /**
   * Allows the game to check the total number of enemies
   */
  public static int getEnemyCounter()
  {
    return Enemy.enemyCounter;
  }


  // instance variables
  /**
   * Amount of health
   */
  private int health;
  /**
   * The enemy's weakness as either 1, 2, or 3.
   *
   */
  private int magicWeakness;
  /**
   * Name of the enemy's attack. Default is "slap".
   */
  private String attackName;
  // private instance vars for health, int magicWeakness, attackName


  /**
   * Creates a new Enemy with the default Npc name and default Npc description.
   * Health is set to 100, attack name is set to "slap", and
   * magicWeakness is randomly set to 1, 2, or 3.
   */
  public Enemy(){
    super();
    Enemy.enemyCounter++;
    health = 100;
    attackName = "slap";
    magicWeakness = (int)(Math.random() * 3 + 1);
  }


  /**
   * Creates a new Enemy with the default Npc name and default Npc description.
   * Health is set to 100, attack name is set to "slap", and
   * magicWeakness is randomly set to 1, 2, or 3.
   * @param enemyName         This Enemy's name.
   * @param enemyDescription  This Enemy's description.
   */
  public Enemy(String enemyName, String enemyDescription){
    super(enemyName,enemyDescription);
    Enemy.enemyCounter++;
    health = 100;
    attackName = "slap";
    magicWeakness = (int)(Math.random() * 3 + 1);
  }
  /**
   * Returns the name of the Enemy's attack.
   * @return                The name of the Enemy's attack
   */
  public String getAttackName(){
    return attackName;
  }


  /**
   * Returns the Enemy's health.
   * @return                The Enemy's health
   */
  public int getHealth(){
    return health;
  }


  /**
   * Returns the Enemy's weakness as 1, 2, or 3.
   * 1 is fire, 2 is ice, 3 is lightning.
   * @return                The Enemy's weakness as 1, 2, or 3
   */
  public int getMagicWeakness(){
    return magicWeakness;
  }


  /**
   * Sets the Enemy's health to be the current health minus healthLost.
   * @param healthLost      Amount of health the Enemy will lose
   */
  public void loseHealth(int healthLost){
    health -= healthLost;
  }


  /**
   * Sets a new name for the Enemy's attack.
   * @param newAttackName   The name of an attack
   */
  public void setAttackName(String newAttackName){
    attackName = newAttackName;
  }


}







