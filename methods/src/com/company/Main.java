package com.company;

public class Main {

    public static void main(String[] args) {

        int position;
        String playerName1 = "Pablo";
        String playerName2 = "Pedro";
        String playerName3 = "Pepe";
        String playerName4 = "Pepa";
        int score1 = 1500;
        int score2 = 900;
        int score3 = 400;
        int score4 = 50;

        position = calculateHighScorePosition(score1);
        displayHighScorePosition(playerName1, position);

        position = calculateHighScorePosition(score2);
        displayHighScorePosition(playerName2, position);

        position = calculateHighScorePosition(score3);
        displayHighScorePosition(playerName3, position);

        position = calculateHighScorePosition(score4);
        displayHighScorePosition(playerName4, position);

    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println("Player name: " + playerName);
        System.out.println("Managed to get into position: " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int playerPosition;

        if(playerScore > 1000) {
            playerPosition = 1;
        } else if ((playerScore >= 500) && (playerScore < 1000)){
            playerPosition = 2;
        } else if ((playerScore >= 100) && (playerScore < 500)){
            playerPosition = 3;
        } else{
            playerPosition = 4;
        }
        return playerPosition;
    }
}
