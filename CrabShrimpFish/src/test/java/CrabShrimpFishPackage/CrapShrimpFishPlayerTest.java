package CrabShrimpFishPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrapShrimpFishPlayerTest {

    @Test
    public void createPlayerTest(){

        //Given
        String name = "John";
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name);

        //When
        String actual = gambler1.getName();

        //Then
        assertTrue(gambler1 instanceof  CrapShrimpFishPlayer);

    }

    @Test
    public void getPlayerNameTest(){

        //Given
        String name = "John";
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer("John");

        //When

        String actual = gambler1.getName();


        //Then
        assertEquals(name, actual);

    }

    @Test
    public void setPlayerNameTest(){

        //Given
        String name = "John";
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer();

        //When
        gambler1.setName(name);
        String actual = gambler1.getName();


        //Then
        assertEquals(name, actual);

    }

    public void createPlayerandFunds(){


    }


    @Test
    public void getPlayerFundsTest(){

        //Given
        String name = "John";
        int funds = 5000;


        //When
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name, funds);
        int actual = gambler1.getFunds();

        //Then
        assertEquals(funds, actual);

    }

    @Test
    public void getPlayerBetsAndFunds(){

        //Given
        String name = "John";
        int funds = 5000;


        //When
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name, funds);
        int actual = gambler1.getFunds();

        //Then
        assertEquals(funds, actual);

    }

    @Test
    public void getFundstest2(){
        //Given
        String name = "John";
        int funds = 50000;


        //When
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name);
        int actual = gambler1.getFunds();

        //Then
        assertEquals(funds, actual);
    }

    @Test
    public void betFundsTest(){
        //Given
        String name = "John";
        int funds = 5000;
        int bet = 5000;
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name,5000);

        //When
        int expected = gambler1.getFunds() - bet;
        gambler1.betFunds(5000);
        int actual = gambler1.getFunds();


        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void betFundsTest2(){
        //Given
        String name = "John";
        int funds = 5000;
        int bet = 6000;
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name,5000);

        //When
        int actual = gambler1.getFunds();


        //Then
        assertFalse(gambler1.betFunds(bet));
    }


    @Test
    public void setPlayerBets(){

        //Given
        String name = "John";
        int betAmnt = 500;
        int betIndex = 1;
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name,5000);

        //When
        gambler1.setPlayerBet(1, betAmnt);
        int actual = gambler1.getPlayerBet2()[1];

        //Then
        assertEquals(betAmnt, actual);


    }

    @Test
    public void setInvalidBet(){

        //Given
        String name = "John";
        int betAmnt = 50000;
        int betIndex = 1;
        CrapShrimpFishPlayer gambler1 = new CrapShrimpFishPlayer(name,5000);

        //When
        gambler1.setPlayerBet(1, betAmnt);
        int actual = gambler1.getPlayerBet2()[1];

        //Then
        assertNotEquals(betAmnt, actual);


    }

    public void getPlayerBets(){

        //Given

        //When

        //Then

    }

}