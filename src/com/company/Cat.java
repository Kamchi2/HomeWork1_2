package com.company;

public class  Cat extends Pet{
    private Personality personality;

    public Cat(Personality personality, String name, String breed, EnumColor enumColor, Cat agility) {
        this.personality = personality;
        this.name = name;
        this.breed = breed;
        this.enumColor = enumColor;
        this.agility = agility;
    }

    public Personality getPersonality() {
        return personality;
    }

    private String name;
    private String breed;
    private EnumColor enumColor;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public EnumColor getEnumColor() {
        return enumColor;
    }

    public Cat getAgility() {
        return agility;
    }
    private Cat agility;
    public final String getInfo(){
        return super.getInfo() +
                "\npersonality: "+ personality +
                "\nname: " + name +
                "\nbreed: " + breed +
                "\ncolor: " + enumColor +
                "\nagility: " + agility
                ;
    }
}
