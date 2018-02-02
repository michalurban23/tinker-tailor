package com.codecool.michalurban.game;

import java.util.List;

public interface Game {

    void setup(int players, int count);
    void play();
    Integer getWinner();
    List<Integer> getResults();

}
