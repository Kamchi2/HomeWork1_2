package com.company;

import java.util.Arrays;
public class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;


    public Dog(String name, String breed, String[] commands, Shelter shelter, EnumColor enumColor) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setEnumColor(enumColor);
    }
    public Dog(String name, String breed, Shelter shelter, EnumColor enumColor) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setEnumColor(enumColor);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
    public void makeVoice(){
        System.out.println("");
    }
    public final void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        if (commands == null){
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed;
        }else {
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed +
                    "\nCommands: " + Arrays.toString(commands);
        }

    }
}
