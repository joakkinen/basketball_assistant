package com.joakkinen.basketballassistant.entities;

/**
 * Created by jalvarez on 1/03/14.
 */
public class Match {

    public Match(int id, int idteam1, int idteam2) {
        _id=id;
        _idteam1=idteam1;
        _idteam2=idteam2;
    }

    private int _id;
    private int _idteam1;   // local team
    private int _idteam2;
    //date
    //court
    //championship
}
