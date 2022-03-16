package Generics;

import java.util.ArrayList;

public class Team<P extends Player> implements Comparable<Team<P>> {
    private String name;
    private int played, won, lost, draw;
    private ArrayList<P> players= new ArrayList<>();

    public Team(String name) {
        this.name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.draw = 0;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(P player) {
        if(players.contains(player)) {
            System.out.println(player.getName()+" already exists in " + name);
            return false;
        }
        else if(player == null)
            return false;
        players.add(player);
        System.out.println(player.getName()+" added to " + name);
        return true;
    }

    public void result(Team<P> opponent, int ourScore, int oppScore) {
        if(ourScore>oppScore) {
            won++;
        }
        else if(ourScore<oppScore) {
            lost++;
        }
        else {
            draw++;
        }
        if(opponent != null) {
            opponent.result(null, oppScore, ourScore);
        }
    }

    public int score() {
        return won*3 + draw;
    }

    @Override
    public int compareTo(Team<P> team) {
        if(this.score() > team.score()) {
            return -1;
        }
        else if(this.score() < team.score()) {
            return 1;
        }
        else
            return 0;
    }
}
