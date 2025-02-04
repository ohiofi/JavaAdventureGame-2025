import java.lang.Math;
/*
TO DO LIST:
Item (10 tasks)
 + NoArgsConstructor
 + Item(String _name, String _description)
 + int getMagicType()
 + String getName()
 + int getAttackPower()
 + void setDescription(String newDescription)
 + void setName(String newName)
 + isBroken()
 + toString() // returns the description
 + void weaken()
 */


 /**
  * Represents a breakable Item that the player can use as a weapon in a fight.
  * Each Room can contain an Item. The player can hold one Item at a time.
  */
  public class Item {
  private String name;
  private int strength;
  private String description;
  private int magicType;


  public Item() {
    magicType = (int)(Math.random() * 3) + 1;
    name = "nuclear bomb";
    description = "insert incredibly cool description here";
  }




  public Item(String _name, String _description) {
    magicType = (int)(Math.random() * 3) + 1;
    name = _name;
    description = _description;
  }


  public String toString() {
    return description;
  }


  public int getMagicType() {
    return magicType;
  }


  public String getName() {
    return name;
  }


  public void setName(String _name) {
    name = _name;
  }


  public int getAttackPower() {
    return (1 + (strength / 2) + (int)(Math.random() * (strength / 2)) + (int)(Math.random() * (strength / 2)));
  }


  public void setDescription(String newDescription) {
    description = newDescription;
  }


  public void weaken() {
    strength = strength / 2;
  }


  public boolean isBroken() {
    if (strength <= 0) {
      return true;
    }
    return false;
  }


}





