package com.hubberspot.designpattern.behavioral.strategy;

public abstract class Team {
    private String teamName;
    private TeamStrategy teamStrategy;

    public String getTeamName() {
        return teamName;
    }

    public TeamStrategy getTeamStrategy() {
        return teamStrategy;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamStrategy(TeamStrategy teamStrategy) {
        this.teamStrategy = teamStrategy;
    }

    public abstract void teamInfo();

    public void playGame(){
        teamStrategy.play(teamName);
    }

}
