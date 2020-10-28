package ar.com.ada.online.second.tp1;

public class HealingSpells extends Spells {
    private int lifeRecovered;

    // Constructor
    public HealingSpells(int magicEnergySpent, int lifeRecovered) {
        super(magicEnergySpent);
        this.lifeRecovered = lifeRecovered;
    }


    // Getters & Setters
    public int getLifeRecovered() {
        return lifeRecovered;
    }

    public void setLifeRecovered(int lifeRecovered) {
        this.lifeRecovered = lifeRecovered;
    }


}
