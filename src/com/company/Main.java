package com.company;

public class Main {

    public static void main(String[] args) {
        Shelter shelter = new Shelter("Romashka", "Pochtovay 1");
        Dog dog = new Dog("Rex", "Ovcharka", new String[]{"Begat","Golos"},shelter, EnumColor.WHITE);
        System.out.println(dog.getInfo());
        dog.makeVoice("Gav gav");

        System.out.println("____________________________________________________________________");

        Shelter shelter1 = new Shelter("KB", "Kojomberdieva 1");
        Dog dog1 = new Dog("Tuzik", "Chiha",shelter1,EnumColor.BLACK);
        System.out.println(dog1.getInfo());

        System.out.println("____________________________________________________________________");

        Shelter shelter2 = new Shelter("DogLand", "8-marta 53");
        Dog objectA = new Dog("Bobik", "doberman", new String[]{"sidet","golos","lapu"},shelter2, EnumColor.BLACK);
        System.out.println(objectA.getInfo());
        objectA.makeVoice("Gav gav");

        System.out.println("____________________________________________________________________");

        Shelter shelter3 = new Shelter("BigDogs", "8-marta 15");

        Fightning_Dog objectB = new Fightning_Dog("tobi", "buldog", new String[]{ "golos","sidet", "ko mne", "fas","nelza"}, shelter3, EnumColor.BROWN);
        System.out.println(objectB.getInfo());
        objectB.makeVoice("Gav gav");
        objectB.getInfo();

        System.out.println("____________________________________________________________________");

        Fightning_Dog objectС = new Fightning_Dog("tayson", "alabai", new String[]{"sidet", "ko mne", "golos", "nelza", "fas"}, shelter3, EnumColor.BROWN);
        System.out.println(objectС.getInfo());
        objectС.makeVoice("Gav gav");
        objectС.getInfo();

    }
}
