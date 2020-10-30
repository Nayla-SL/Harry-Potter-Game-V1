package ar.com.ada.online.second.tp1;

public class AttackSpells extends Spells {
    private int damageMade;

    // Constructor
    public AttackSpells(String name, int magicEnergySpent, int damageMade) {
        super(magicEnergySpent);
        name = name;
        this.damageMade = damageMade;
    }


    //Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setMagicEnergySpent(int magicEnergySpent) {
        super.setMagicEnergySpent(magicEnergySpent);
    }

    @Override
    public int getMagicEnergySpent() {
        return super.getMagicEnergySpent();
    }

    public int getDamageMade() {
        return damageMade;
    }

    public void setDamageMade(int damageMade) {
        this.damageMade = damageMade;
    }
}
