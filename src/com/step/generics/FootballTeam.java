package com.step.generics;

public class FootballTeam extends Team{
    private int totalPoints;

    public FootballTeam(String name,int matchesWon, int matchesLost, int matchesDraw) {
        this.name = name;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDraw = matchesDraw;
        this.totalPoints = this.matchesWon - this.matchesLost *2;
    }


    public int getPoints(){
        return this.totalPoints;
    }

    @Override
    public int compareWith(Team team) {
        return this.totalPoints - team.getPoints();
    }

    @Override
    protected String getName() {
        return this.name;
    }
}
