package com.company;

import java.util.Arrays;

public final class Fightning_Dog extends Dog{

    private String name;
    private String breed;
    private String[] commands;

    public Fightning_Dog(String name, String breed, String[] commands, Shelter shelter, EnumColor enumColor, String name1, String breed1, String[] commands1, int wins) {
        super(name, breed, commands, shelter, enumColor);
        this.name = name1;
        this.breed = breed1;
        this.commands = commands1;
        this.wins = wins;
    }

    private int wins;

    public int getWins() {
        return wins;
    }

    public Fightning_Dog(String name, String breed, String[] commands, Shelter shelter, EnumColor enumColor) {
        super(name, breed, commands, shelter, enumColor);
    }

    public Fightning_Dog(String name, String breed, Shelter shelter, EnumColor enumColor) {
        super(name, breed, shelter, enumColor);
    }
    public String getInfo() {
        if (commands == null){
            return super.getInfo() +
                    "\nWins: " + wins
                    ;
        } else {
            return super.getInfo() +
                    "\nCommands: " + Arrays.toString(commands)+
                    "\nWins: " + wins
                    ;
        }

    }
}
