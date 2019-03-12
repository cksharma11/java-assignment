package com.step.generics;

public abstract class Team {
    protected String name;
    protected int matchesWon;
    protected int matchesLost;
    protected int matchesDraw;

    protected abstract int getPoints();

    protected abstract int compareWith(Team team);

    protected abstract String getName();
}
