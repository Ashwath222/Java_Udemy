package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<?>> {
    private final String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)) {
            System.out.println(team.getName()+" already exists in the " + name);
            return false;
        }
        else if(team == null)
            return false;
        else {
            teams.add(team);
            System.out.println(team.getName()+" added to the " + name);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        System.out.println(name + " standings");
        for(T t : teams) {
            System.out.println(t.getName() + " - " + t.score());
        }
    }
}
