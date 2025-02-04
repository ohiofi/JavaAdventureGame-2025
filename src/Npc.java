/*
TO DO LIST:
Npc (8 tasks)
 + NoArgsConstructor
 + Npc(String _name, String _description)
 + String getName
 + String getSpeech
 + void setDescription(String newDescription)
 + void setName(String newName)
 + void setSpeech(String newSpeech)
 + toString() // returns only the description
 */
public class Npc
{


  // instance variable go here
  // private instance vars for name, speech, description
  private String name;
  private String speech;
  private String description;
 
  
  
  public Npc(){
    // to do
    name = "i dont know";
    speech = "hi";
    description = "tall";
  }


  public Npc(String newName, String newDescription) {
    // TODO
    this.name = newName;
    this.description = newDescription;
    this.speech = "hi";
  }


  public String getName() {
    
    return name;
  }


  public String getSpeech() {


    return speech;
  }


  public void setDescription(String newDescription){
    // to do
    this.description = newDescription;
  }


  public void setName(String newName) {
    // to do
    this.name = newName;
  }


  public void setSpeech(String newSpeech){
    // to do
    this.speech = newSpeech;
  }


  // returns only the description
  public String toString() {
    // to do
    return description;
  }


}







