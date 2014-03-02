package com.joakkinen.basketballassistant.entities;

/**
 * Player class
 */
public class Player {

    public Player(int id,String name, String surname) {
        _id=id;
        _name=name;
        _surname=surname;
    }

    public madeShot(int type, int made) {

    }

    public getRebound(int type) {

    }

    public madeAssist(int toPlayer) {

    }

    public madeFoult(int type, int toPlayer) {

    }

    public getFoult(int type, int fromPlayer) {

    }

    public madeSteal() {

    }

    public madeBlock() {

    }

    public madeLost() {

    }

    private int _id;
    private String _name;
    private String _surname;
    private int _yearbirth;
    private float _weight;
    private float _height;
    private String[] _postion;
    int _team;
    private PlayerStats _ps;
    private PlayerStatsMatchLevel1 _cm;    // current match

}

