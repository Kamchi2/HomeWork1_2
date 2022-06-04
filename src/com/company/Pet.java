package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private EnumColor enumColor;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EnumColor getEnumColor() {
        return enumColor;
    }

    public void setEnumColor(EnumColor enumColor) {
        this.enumColor = enumColor;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(15) + 1;
    }
    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + enumColor +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }

}
