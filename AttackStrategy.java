package com.hubberspot.designpattern.behavioral.strategy;

public class AttackStrategy implements TeamStrategy {


    @Override
    public void play(String team) {
        System.out.println(team + " will play in attacking mode.");
    }
}
