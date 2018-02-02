package com.codecool.michalurban.game;

import java.util.LinkedList;
import java.util.List;

public class TinkerTailor implements Game {

    private int count;
    private List<Integer> players;
    private List<Integer> outcome;

    public void setup(int players, int count) {

        this.outcome = new LinkedList<>();
        this.players = new LinkedList<>();
        this.count = count;

        for (int i = 0; i < players;) {
            this.players.add(++i);
        }
    }

    public void play() {

        play(0);
    }

    private void play(int startingIndex) {

        int toRemove = (startingIndex + count - 1) % players.size();

        outcome.add(players.get(toRemove));
        players.remove(toRemove);

        if (players.size() > 0) {
            play(toRemove);
        }
    }

    public Integer getWinner() {

        return this.outcome.get(outcome.size()-1);
    }

    public List<Integer> getResults() {

        return this.outcome;
    }
}
