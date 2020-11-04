package ar.com.ada.online.second.tp1;

import java.util.ArrayList;

public class Spell {

    protected int magicEnergySpent;
    protected String name;

    // Constructor

    public Spell(int magicEnergySpent, String name) {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;

    }

    public Spell(int magicEnergySpent) {
        this.name = name;
        this.magicEnergySpent = this.magicEnergySpent;

    }

    public Spell() {
        this.name = name;
        this.magicEnergySpent = magicEnergySpent;
    }


    //Getter & Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicEnergySpent() {
        return magicEnergySpent;
    }

    public void setMagicEnergySpent(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\nMagic energy spent: " + magicEnergySpent + "\n"
                ;
    }
}

