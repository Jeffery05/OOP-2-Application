/*
 * This program will represent a human in our program.
 * @author Akshar Barot
 * @author Jeffery Hu
 * @since 2021-03-11
 * Teacher: Ms. Krasteva
*/

public class Human{
   // Attributes
   String name;
   String gender;
   int age;
   String hairColour;
   String shoeColour;
   double amtMoney;
   double bankAccountMoney;
   
   //Constructor
   public Human(String name, String gender, int age, String hairColour, String shoeColour, double amtMoney, double bankAccountMoney){
      this.name = name;
      this.gender = gender;
      this.age = age;
      this.hairColour = hairColour;
      this.shoeColour = shoeColour;
      this.amtMoney = amtMoney;
      this.bankAccountMoney = bankAccountMoney;
   }
   
   //Default Constructor
   public Human(){
      name = "Bob Jones";
      gender = "male";
      age = 20;
      hairColour = "black";
      shoeColour = "black";
      amtMoney = 25;
      bankAccountMoney = 500;
   }
   
   //The reportCrime() method, which will print a statement that the human called the police
   public void reportCrime (MafiaMember suspect){
      System.out.print(name + " put out a report for a " + suspect.gender + " in a " + suspect.suitColour + " suit with " + suspect.shoeColour + " shoes, ");
      if (suspect.hatType.equals(null)){
         System.out.println ("with " + suspect.hairColour + " hair.");
      }
      else {
         System.out.println ("wearing a " + suspect.hatType + ".");
      }

      System.out.println ("The police have arrived!");
   }
}