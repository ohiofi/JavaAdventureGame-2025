/*
TO DO LIST:
Room (13 tasks)
 + NoArgsConstructor
 + Room(String _name)
 + Npc getCharacter()
 + Item getItem()
 + Room getLocationTo(String direction)
 + String getName()
 + String getPossibleDirections()
 + void linkRoom(Room r, String direction)
 + void setCharacter(Npc character)
 + void setDescription(String d)
 + void setItem(Item i)
 + void setName(String _name)
 + toString() // returns only the description
*/
public class Room{
    private String name;
    private String description;
    private Npc character;
    private Item roomItem;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
  
    public Room(){
     name = "Room";
    }
  
    public Room(String _name){
     // to do
     this.name = _name;
     this.description = "green";
    }
  
    public Npc getCharacter(){
      // to do
      return this.character;
    }
  
    public Item getItem()
    {
      // to do
      return this.roomItem;
    }
  
   // precondition: direction is either "north" or "south" or "east" or "west"
   // if none of those directions, then return the current room
    public Room getLocationTo(String direction)
    {
      // TODO
      // if none of those conditions, then return the current room
      if (direction.equals("north")) {
        return this.north;
      } else if (direction.equals("south")){
        return this.south;
      } else if (direction.equals("east")){
        return this.east;
      } else if(direction.equals("west")){
        return this.west;
      } else{
        return this;
      }
    }
  
    public String getName()
    {
      // to do
      return this.name;
    }
  
    public String getPossibleDirections()
    {
      String result = "";
      if (this.north != null){
        result += "North, ";
      }
      if (this.east != null){
        result += "East, ";
      }
      if (this.south != null){
        result += "South, ";
      }
      if (this.west != null){
        result += "West, ";
      }
      return result;
    }
  
    /**
    @param direction - direction should be the lowercase words "north" "south" "east" or "west
    @param r - a room object should be supplied for the variable r
  
    // precondition: direction is either "north" or "south" or "east" or "west" */
   public void linkRoom(Room r, String direction)
    {
      // TODO
      if (direction.equals("north")) {
        this.north = r;
      } else if (direction.equals("south")) {
        this.south = r;
      } else if (direction.equals("east")) {
        this.east = r;
      } else if (direction.equals("west")) {
        this.west = r;
      }
    }
  
  
    /**
    @param a npc object that is then stored into the instance variable character
    // sets the character to a Npc object that is passed into this method
  
   */
    public void setCharacter(Npc _character)
    {
      this.character = _character;
    }
  
    /**
    @param  String that describes a room. example: "dark room that is very small"
  
   */
    public void setDescription(String newDescription)
    {
      this.description = newDescription;
    }
  
    public void setItem(Item i)
    {
      this.roomItem = i;
    }
  
    public void setName(String _name)
    {
      this.name = _name;
    }
  
     // returns only the description
    public String toString()
    {
      // to do
      return this.description;
    }
  
  }
  
  


