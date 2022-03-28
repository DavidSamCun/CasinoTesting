package CrabShrimpFishPackage;

public class CrapShrimpFishPlayer{

    private String name;

    private int funds;

    private boolean win = false;

    private int[] playerBet;

    public CrapShrimpFishPlayer(){
        this.name = "Player1";
        this.playerBet = new int[6];
        this.funds = 50000;

    }

//    public CrapShrimpFishPlayer(Person player){
//        this.name  = player.getName();
//        this.playerBet = new int[6];
//        this.funds = player.getFunds();
//    }

    public CrapShrimpFishPlayer(String name){
        this.name = name;
        this.playerBet = new int[6];
        this.funds = 50000;
    }

    public CrapShrimpFishPlayer(String name, int funds){
        this.name = name;
        this.playerBet = new int[6];
        this.funds = funds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean setPlayerBet(int index, int bet){
        if(index > 0 && index < 7 && betFunds(bet)) {
            playerBet[index] = bet;
            return true;
        }
        else {
            System.out.println("Invalid choice!");
            return false;
        }
    }

    public Boolean betFunds(int bet){
        if(bet > funds){
            System.out.println("Not enough funds! You have " + funds + " remaining");
            return false;
        }
        else {
            funds -= bet;
            return true;
        }
    }

//    public int getPlayerBet(int index){
//        return playerBet[index];
//    }

    public int[] getPlayerBet2(){
        return playerBet;
    }


    public int getFunds(){
        return funds;
    }


//    public void getWinnings(int winningFunds){
//        funds += winningFunds;
//    }


}
