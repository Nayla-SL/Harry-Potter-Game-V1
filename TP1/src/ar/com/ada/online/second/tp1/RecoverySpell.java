package ar.com.ada.online.second.tp1;

public class RecoverySpell extends Spell {
    private int energyRecovered;

    // Constructor
    public RecoverySpell(int magicEnergySpent, int energyRecovered) {
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
