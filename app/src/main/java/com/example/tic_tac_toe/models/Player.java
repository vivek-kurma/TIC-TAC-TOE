package com.example.tic_tac_toe.models;

import androidx.room.Entity;

public class Player {

    public String name;
    public String value;

    public Player(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
