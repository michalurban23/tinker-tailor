package com.codecool.michalurban;

import com.codecool.michalurban.game.Game;
import com.codecool.michalurban.game.TinkerTailor;

public class App {

    public static void main( String[] args ) {

        Game game = new TinkerTailor();
        int players = 21; // N parameter
        int count = 3; // K parameter

        game.setup(players, count);
        game.play();

        System.out.println("Game Winner: " + game.getWinner());
        System.out.println("Elimination order: " + game.getResults());
    }

}
