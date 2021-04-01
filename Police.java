public class Police extends Human {
    String rank;
    boolean corruption;

    public Police (String name, String gender, int age, String hairColour, String shoeColour, double amtMoney, double bankAccountMoney, String rank, boolean corruption){
        super (name, gender, age, hairColour, shoeColour, amtMoney, bankAccountMoney);
        this.rank = rank;
        this.corruption = corruption;
    }

    public Police (){
        super ();
        rank = "constable";
        corruption = false;
    }

    public void giveMoralSpeech (MafiaMember suspect, String message){
        System.out.println (rank + ", " + name + " said \"" + suspect.name + message + "\"");
    }

    public void arrest (Human suspect, String charge){
        System.out.println (name + " arrested " + suspect.name + " for " + charge + " They have been taken to prison!");
        suspect.amtMoney = 0;
    }
}