package com.step.generics;

import java.util.ArrayList;
import java.util.List;

public class LeagueTable<T extends Team> {
    List<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team team){
        teams.add((T) team);
    }

    public void displayTeams(){
        this.teams.sort((o1, o2) -> o1.compareWith(o2));

        for(Team team : teams){
            System.out.println(team.getName());
        }
    }


}
