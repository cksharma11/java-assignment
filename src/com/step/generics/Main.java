package com.step.generics;

public class Main {

    private String x;

    public static void main(String[] args) {
        CricketTeam india = new CricketTeam("India", 11, 2, 0);
        CricketTeam aus = new CricketTeam("Aus", 5, 5, 0);
        CricketTeam wi = new CricketTeam("WI", 7, 12, 0);

        FootballTeam india1 = new FootballTeam ("India", 11, 2, 0);
        FootballTeam aus1 = new FootballTeam ("Aus", 5, 5, 0);
        FootballTeam wi2 = new FootballTeam ("WI", 7, 12, 0);


        LeagueTable leagueTable = new LeagueTable();
        leagueTable.addTeam(india);
        leagueTable.addTeam(aus);
        leagueTable.addTeam(wi);
        leagueTable.displayTeams();

        System.out.println("***************************");

        LeagueTable leagueTable1 = new LeagueTable();
        leagueTable1.addTeam(india1);
        leagueTable1.addTeam(aus1);
        leagueTable1.addTeam(wi2);

        leagueTable1.displayTeams();
    }
}
