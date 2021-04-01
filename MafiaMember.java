/*
 * This program will represent a mafia member in our program.
 * @author Akshar Barot
 * @author Jeffery Hu
 * @since 2021-03-11
 * Teacher: Ms. Krasteva
*/

public class MafiaMember extends Human{
   // Attributes
   String suitColour;
   String hatType;
   
   //Constructor
   public MafiaMember(String name, String gender, int age, String hairColour, String shoeColour, double amtMoney, double bankAccountMoney, String suitColour, String hatType){
      super(name, gender, age, hairColour, shoeColour, amtMoney, bankAccountMoney);
      this.suitColour = suitColour;
      this.hatType = hatType;
   }
   
   //Default Constructor
   public MafiaMember(){
      super();
      suitColour = "black";
      hatType = "top hat";
   }
   
   //The reportCrime() method, which will print a statement that the human called the police
   public void rob (Bank target){
      System.out.print(name + " has robbed the " + target.name + "! They stole $");
      System.out.printf ("%.2f", target.bankMoney);
      System.out.println ("!");
      amtMoney += target.bankMoney;
      target.bankMoney = 0;
   }
   
   public void extort(Human victim){
      System.out.print (name + " has extorted " + victim.name + "! They took $");
      System.out.printf ("%.2f", victim.amtMoney);
      System.out.println ("!");
      amtMoney += victim.amtMoney;
      victim.amtMoney = 0;
   }
   
   // add police officer object once completed
   public void bribe(Police police, double money){
      if (!police.corruption){
         System.out.println (name + " tried to bribe " + police.name + ", but they were not a corrupt police officer. " + name + " has been arrested.");
         police.arrest(this, "attempting to bribe an on duty police officer");
      }
      else {
         System.out.print (name + " bribed the police officer with $");
         System.out.printf ("%.2f", money);
         System.out.println (". " + police.rank + " " + police.name + " has decided to leave " + name + " alone.");
         police.amtMoney += money;
         amtMoney -= money;
      }
   }
}