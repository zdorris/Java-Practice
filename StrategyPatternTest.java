package com.hubberspot.designpattern.behavioral.strategy;

public class StrategyPatternTest {
    public static void main(String[] args){
        Team teamGermany = new TeamGermany();
        Team teamArgentina = new TeamArgentina();

        //Strats
        TeamStrategy attack = new AttackStrategy();
        TeamStrategy defend = new DefenseStrategy();

        //Germany starts on defense
        //Arg starts on attack
        teamGermany.setTeamStrategy(defend);
        teamArgentina.setTeamStrategy(attack);

        //names
        teamGermany.setTeamName("Germany");
        teamArgentina.setTeamName("Argentina");


        teamGermany.teamInfo();
        teamGermany.playGame();

        teamArgentina.teamInfo();
        teamArgentina.playGame();


        System.out.println("");
        System.out.println("After half time");
        System.out.println("");

        teamGermany.setTeamStrategy(attack);
        teamArgentina.setTeamStrategy(defend);

        teamGermany.teamInfo();
        teamGermany.playGame();

        teamArgentina.teamInfo();
        teamArgentina.playGame();

    }
}
