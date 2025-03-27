package com.designpattern.state.remote;

public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }}