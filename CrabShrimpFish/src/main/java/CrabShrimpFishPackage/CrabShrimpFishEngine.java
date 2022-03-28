package CrabShrimpFishPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrabShrimpFishEngine {

    List<CrapShrimpFishPlayer> playerList = new ArrayList<>();
    private CrabShrimpFishGame game;


    public CrapShrimpFishPlayer addPlayer(String name, int funds){
        return new CrapShrimpFishPlayer(name, funds);
    }


    public void newGame() {
        this.game = new CrabShrimpFishGame();
    }




}

//    public CrabShrimpFishEngine(CrabShrimpFishGame game, ArrayList<CrapShrimpFishPlayer> players) {
//    }
//
//    boolean gameOver = false;
//    CrabShrimpFishGame game;
//
//    public void start() {
//        gameOver = false;
//        game = new CrabShrimpFishGame();
//        String choice = "";
//        int bet = 0;
//        Scanner in = new Scanner(System.in);
//        CrapShrimpFishPlayer player = addPlayer();
//        System.out.println("Welcome to CrabShrimpFish!");
//
//        while(!gameOver){
//            System.out.println("\n Please place your bets!");
//
//            for (int i = 0; i < 6; i++){            //Bet Phase
//                System.out.println("\nHow much would you like to bet on " + (i+1) + "?");
//                bet = in.nextInt();
//                player.setPlayerBet(i, bet);
//                System.out.println("You've bet " + bet + " on "+ (i+1));
//            }
//
//            //Roll Dice
//            System.out.println("\n Commencing Dice Roll!");
//            game.rollDice();
//
//            //Check Bets
//            game.checkWin(player);
//
//            //Play again?
//            System.out.println("\n Would you like to play again? yes or no?");
//            if(choice.equals("no")){
//            exitGame();
//            }
//
//        }
//
//    }
//
//    public void getGame() {
//        new CrabShrimpFishGame();
//    }
//
//    public void exitGame() {
//    gameOver = true;
//    }
//
//    public void replay() {
//
//    }
//
//    public CrapShrimpFishPlayer addPlayer(){
//        CrapShrimpFishPlayer player1 = new CrapShrimpFishPlayer();
//        return player1;
//    }
//
//    public void resetBet(){
//
//    }
