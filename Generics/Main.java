package Generics;

public class Main {
    public static void  main(String[] args) {
        FootballPlayer messi = new FootballPlayer("Messi");
        FootballPlayer ronaldo = new FootballPlayer("Ronaldo");
        FootballPlayer hazard = new FootballPlayer("Hazard");

        Team<BaseballPlayer> athletics = new Team<>("Oakland Athletics");
        //athletics.addPlayer(messi);

        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        chelsea.addPlayer(messi);
        chelsea.addPlayer(hazard);

        Team<FootballPlayer> manu = new Team<>("Manchester United");
        manu.addPlayer(ronaldo);

        Team<FootballPlayer> liverpool = new Team<>("liverpool");
        liverpool.addPlayer(new FootballPlayer("Salah"));

        League<Team<FootballPlayer>> pl = new League<>("Premier League");
        pl.addTeam(chelsea);
        pl.addTeam(manu);
        pl.addTeam(liverpool);
        pl.addTeam(chelsea);
        //pl.addTeam(athletics);

        chelsea.result(manu, 3, 0);
        chelsea.result(liverpool, 5, 2);
        liverpool.result(manu,1,2);
        pl.showLeagueTable();
    }
}
