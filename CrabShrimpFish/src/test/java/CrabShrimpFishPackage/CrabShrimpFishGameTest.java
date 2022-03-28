package CrabShrimpFishPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrabShrimpFishGameTest {

    @Test
    public void createGameTest(){

        //Given
        CrabShrimpFishGame game = new CrabShrimpFishGame();

        //When

        //Then
        assertTrue(game instanceof CrabShrimpFishGame);
        assertTrue(game.crabbieDealer instanceof CrapShrimpFishPlayer);
    }

    @Test
    public void rollDiceTest(){

        //Given
        CrabShrimpFishGame game = new CrabShrimpFishGame();
        Boolean diceRolled = false;
        //When
        game.rollDice();

        //Then
        for (int i = 1; i < 7; i++){
            if (game.checkDiceRoll(i) > 0){
                diceRolled = true;
                break;
            }
        }

        //Then
        assertTrue(diceRolled);

    }

    @Test
    public void checkRollTest(){

        //Given


        //When


        //Then


    }

    @Test
    public void resetTest(){

        //Given

        //When

        //Then

    }

}