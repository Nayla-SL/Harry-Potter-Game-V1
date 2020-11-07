package ar.com.ada.online.second.tp1;

public class HealingSpell extends Spell {
    private int lifeRecovered;

    // Constructor
    public HealingSpell( String name, int magicEnergySpent, int lifeRecovered) {
        super(name, magicEnergySpent);
        this.name = name;
        this.lifeRecovered = lifeRecovered;
    }


    // Getters & Setters
    public int getLifeRecovered() {
        return lifeRecovered;
    }

    public void setLifeRecovered(int lifeRecovered) {
        this.lifeRecovered = lifeRecovered;
    }

    public String getName() {
        return name;
    }

    public void setName() {
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

    @Override
    public String toString() {
        return "Healing Spell" +
                "\n\t name: " + name +
                "\n\t life recovered: " + lifeRecovered +
                "\n\t magic energy spent: " + magicEnergySpent + "\n";
    }
}
