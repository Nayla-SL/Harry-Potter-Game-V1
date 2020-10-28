package ar.com.ada.online.second.tp1;

public class AttackSpells extends Spells {
    private int damageMade;

    // Constructor
    public AttackSpells(int magicEnergySpent, int damageMade) {
        super(magicEnergySpent);
        this.damageMade = damageMade;
    }


    //Getter & Setter
    public int getDamageMade() {
        return damageMade;
    }

    public void setDamageMade(int damageMade) {
        this.damageMade = damageMade;
    }
}
