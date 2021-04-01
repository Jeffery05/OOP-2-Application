public class Bank {
    String name;
    String location;
    Human bankManager;   
    double bankMoney;

    public Bank (String name, String location, Human bankManager, double bankMoney){
        this.name = name;
        this.location = location;
        this.bankManager = bankManager;
        this.bankMoney = bankMoney;
    }

    public Bank (){
        name = "Grand Bank";
        location = "England";
        bankManager = new Human("William Scott", "male", 38, "black", "white", 65.0, 2200.0);
        bankMoney = 100000000.00;
    }


    public void deposit (Human client, double moneyDeposit){
        if (client.amtMoney < moneyDeposit){
            System.out.print (client.name + " aren't able to deposit the money since they don't have enough. They only have $");
            System.out.printf ("%.2f", client.amtMoney);
            System.out.println (".");
        }
        else {
            client.amtMoney -= moneyDeposit;
            client.bankAccountMoney += moneyDeposit;
            bankMoney += moneyDeposit;
            System.out.print (client.name + " deposited $"); 
            System.out.printf ("%.2f", moneyDeposit);
            System.out.print (". They now have $");
            System.out.printf ("%.2f", client.amtMoney);
            System.out.println (" left.");
        }
    }

    public void displayBankMoney (){
        System.out.print ("The " + name + " is currently storing $");
        System.out.printf ("%.2f", bankMoney);
        System.out.println (".");
    }
}