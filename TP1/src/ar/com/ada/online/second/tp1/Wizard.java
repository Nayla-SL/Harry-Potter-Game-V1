package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Wizard extends Character {
    protected Wand wand;
    protected boolean darkWizard;

    //constructor


    public Wizard() {
    }

    // getters and setters


    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public Integer getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }


    public String getTypeOfCharacter() {
        return typeOfCharacter;
    }

    public void setTypeOfCharacter(String typeOfCharacter) {
        this.typeOfCharacter = typeOfCharacter;
    }

    public boolean isDarkWizard() {
        return darkWizard;
    }

    public void setDarkWizard() {
        this.darkWizard = darkWizard;
    }

    // Methods

    public void isDarkOrNot() {
        int counterAttackSpells = 0;
        for (int i = 0; i < this.spells.size(); i++) {
            if (this.spells.get(i) instanceof AttackSpell)
                counterAttackSpells++;
        }
        darkWizard = (counterAttackSpells > 3);
    }


    // Overrides

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wizard that = (Wizard) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                typeOfCharacter.equals(that.typeOfCharacter) &&
                wand.equals(that.wand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, typeOfCharacter, wand, spells);
    }

    @Override
    public String toString() {


        String output = String.format(
                "Character: \n Type of Character: %s \n Name: %s  Location: %s \n Life span: %d \n Magic energy: %d \n Magic Wand: %s \n Spells: \n Are you a dark wizard? %s",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                wand,
                darkWizard);
        String spellsTxt = "\n\t";
        for (int i = 0; i < spells.size(); i++) {
            spellsTxt += "\t" + spellsTxt + spells.get(i).toString() + "\n";
        }
        output = output + spellsTxt;
        return output;
    }
}

