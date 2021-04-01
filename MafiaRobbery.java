public class MafiaRobbery{
   public static void main (String args[]){
      //Objects
      Human bankManager = new Human("Rich Uncle PennyBags", "male", 66, "white", "black", 2600, 150000);
      Bank SwissBank = new Bank("Swiss Bank", "Zürich, Switzerland", bankManager, 10000000);
      Human bystander = new Human("Carol Bell", "female", 32, "blonde", "red", 230, 1450);
      MafiaMember mobBoss = new MafiaMember ("Don Vito Corleone", "male", 61, "gray", "black", 450, 2500000, "black", "fedora");
      Police chief = new Police("Alexander Pierce", "male", 77, "blonde", "gray", 500, 1600000, "Director of police", true);
      
      // Plotline
      SwissBank.deposit(bystander, 110);
      SwissBank.displayBankMoney();
      System.out.println ();
      mobBoss.rob(SwissBank);
      mobBoss.extort(bankManager);
      System.out.println ();
      bystander.reportCrime(mobBoss);
      System.out.println ();
      chief.giveMoralSpeech(mobBoss, ", you may be getting money from this, but your life will be in shambles. You won't be free!");
      mobBoss.bribe(chief, 1500);
      System.out.println ();
      chief.arrest(bystander, "making false accusations against a respectable person!");

   }
}