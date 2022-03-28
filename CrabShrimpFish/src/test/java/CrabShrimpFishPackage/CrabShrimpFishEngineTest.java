package CrabShrimpFishPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrabShrimpFishEngineTest {

    @Test
    public void getGameAndPlayerTest(){
        //Given
        String name = "John" ;
        int funds = 5000;

        //When
        CrabShrimpFishGame game = new CrabShrimpFishGame();
        CrapShrimpFishPlayer player1 = new CrapShrimpFishPlayer(name, funds);

        //Then
        assertTrue(game instanceof CrabShrimpFishGame);
        assertTrue(player1 instanceof CrapShrimpFishPlayer);


    }

    @Test
    public void addPlayerTest() {

        //Given
        String name = "John" ;
        int funds = 5000;

        //When
        CrabShrimpFishEngine test = new CrabShrimpFishEngine();
        CrapShrimpFishPlayer player1 = new CrapShrimpFishPlayer(name, funds);
        test.playerList.add(player1);

        //Then
        assertEquals(test.playerList.get(0), player1);
    }

    @Test
    public void newGameTest(){

        CrabShrimpFishEngine test = new CrabShrimpFishEngine();
        test.newGame();

        assertTrue(test.game instanceof CrabShrimpFishGame);

    }

    @Test
    public void startGameTest(){

        CrabShrimpFishEngine test = new CrabShrimpFishEngine();
        test.startGame();

        assertFalse(test.gameOver);

    }

    @Test
    public void placeBetTest(){

    }

    @Test
    public void rollDiceTest(){

    }

    @Test
    public void checkResultsTest(){


    }

    @Test
    public void collectWinTest(){

    }


    @Test
    public void endGameTest(){
        CrabShrimpFishEngine test = new CrabShrimpFishEngine();
        test.startGame();
        test.endGame();

        assertTrue(test.gameOver);
    }

}