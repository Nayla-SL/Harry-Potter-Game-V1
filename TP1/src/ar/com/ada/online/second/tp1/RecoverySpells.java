package ar.com.ada.online.second.tp1;

public class RecoverySpells extends Spells {
    private int energyRecovered;

    // Constructor
    public RecoverySpells(int magicEnergySpent, int energyRecovered) {
        super(magicEnergySpent);
        this.energyRecovered = energyRecovered;
    }


    //Getter & Setter
    public int getEnergyRecovered() {
        return energyRecovered;
    }

    public void setEnergyRecovered(int energyRecovered) {
        this.energyRecovered = energyRecovered;
    }
}
