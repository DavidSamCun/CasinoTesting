package CrabShrimpFishPackage;

import DicePackage.Dice;
import DicePackage.DiceBin;
import DicePackage.DiceSimulation;

public class CrabShrimpFishGame {

    private Dice dice;
    DiceBin bins;
    DiceSimulation roll;
    CrapShrimpFishPlayer crabbieDealer;
    //private Integer[] rolls;

    public CrabShrimpFishGame(){
//        this.dice = new Dice();
//        this.bins = new DiceBin();
        this.roll = new DiceSimulation(1,3);
        this.crabbieDealer = new CrapShrimpFishPlayer("dealer");
        //rolls = new Integer[3];
    }

    public void rollDice(){
        System.out.println("\nRolling Dice...........");
        roll.runSimulation();
        roll.result();
        System.out.println("\nEndRoll............");
        //return true;
    }

//    public int checkWin(CrapShrimpFishPlayer player){
//        int wins = 0;
//        int winnings = 0;
//
//        System.out.println("\nChecking winnings............");
//        for(int i = 0; i < 6; i++){
//            if(player.getPlayerBet2()[i] > 0 && bins.getRollAmount(i+1) > 0){
//                System.out.println("Congrats! You bet on " + i+1 + " and appeared " + bins.getRollAmount(i+1) + " time(s)");
//                 winnings = player.getPlayerBet2()[i]*bins.getRollAmount(i+1);
//            }
//        }
//        if(wins > 0){
//            System.out.println("Congrats on being lucky!");
//        } else {
//            System.out.println("Better luck next time!");
//        }
//        return winnings;
//    }

    public int checkDiceRoll(int playerchoice){
        if (playerchoice> 0 && playerchoice < 7){
            return roll.getDiceBin().getRollAmount(playerchoice);
        }
        else{
            System.out.println("Invalid Roll Value! Must be from 1 to 6");
            return 0;
        }
    }

    public void cashOut(CrapShrimpFishPlayer player){
        int winnings = 0;
        for(int i = 1; i < 7; i++) {
            if (player.getPlayerBet2()[i] > 0 || roll.getDiceBin().getRollAmount(i) > 0);{
                winnings = player.getPlayerBet2()[i]*roll.getDiceBin().getRollAmount(i);

                System.out.println("Congrats! You bet " + player.getPlayerBet2()[i] + " on " + i +
                        ", which appeared " + roll.getDiceBin().getRollAmount(i) + " times!\n You won " + winnings);

                player.addWinnings(winnings);
            }
        }
    }


}
