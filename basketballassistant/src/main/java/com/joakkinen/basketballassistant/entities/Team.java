package com.joakkinen.basketballassistant.entities;

import java.util.List;

/**
 * Team class
 */
public class Team {

    public Team(int id, String name) {
        _id=id;
        _name=name;
    }

    private int _id;
    private String _name;
    private List<Player> _players;
    private int _court;
}
