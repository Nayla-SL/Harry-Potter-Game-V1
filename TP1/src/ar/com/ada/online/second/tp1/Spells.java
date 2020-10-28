package ar.com.ada.online.second.tp1;

import java.util.ArrayList;

public class Spells {

    private int magicEnergySpent;

    // Constructor
    public Spells(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }

    //Getter & Setter

    public int getMagicEnergySpent() {
        return magicEnergySpent;
    }

    public void setMagicEnergySpent(int magicEnergySpent) {
        this.magicEnergySpent = magicEnergySpent;
    }
}