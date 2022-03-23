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

    public void setPlayerBet(int index, int funds){
        playerBet[index] = funds;
    }

    public int getPlayerBet(int index){
        return playerBet[index];
    }

    public int[] getPlayerBet2(){
        return playerBet;
    }

    public int getFunds(){
        return funds;
    }

    public void getWinnings(int winningFunds){
        funds += winningFunds;
    }

}
