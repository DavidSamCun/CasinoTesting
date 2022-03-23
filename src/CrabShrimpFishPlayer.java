package src;

public class CrabShrimpFishPlayer {

        private String name;

        private int funds;

        private boolean win = false;

        private int[] playerBets;

        public void CrapShrimpFishPlayer(){
            this.name = "Player1";
            this.playerBets = new int[6];
            this.funds = 50000;
        }

        public void CrapShrimpFishPlayer(String name){
            this.name = name;
            this.playerBets = new int[6];
            this.funds = 50000;
        }

        public int[] setPlayerBet(int index, int funds){
            playerBets[index] = funds;

            return playerBets;
        }

        public int getPlayerBet(int index){
            return playerBets[index];
        }

        public int[] getPlayerBet2(){
            return playerBets;
        }

        public int getFunds(){
            return funds;
        }

        public int getWinnings(int winningFunds){
            funds += winningFunds;
            return funds;
        }




}
