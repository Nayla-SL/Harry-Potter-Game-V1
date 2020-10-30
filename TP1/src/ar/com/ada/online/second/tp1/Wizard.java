package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Wizard extends Character {
    protected Wand wand;

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

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
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


    // Methods

    public boolean isDarkOrNot(boolean darkWizard, int counterAttackSpells) {
        for (int i = 0; i < 6; i++) {
            switch (spells.getClass().getSimpleName()) {
                case "Attack":
                    counterAttackSpells++;
                default:
                    counterAttackSpells = counterAttackSpells;
            }
        }
        if (counterAttackSpells > 3) {
            darkWizard = true;
        } else {
            darkWizard = false;
        }

        return darkWizard;
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
        return String.format(
                "Character{ Type of Character = %s \n Name= %s \n Location= %d \n Life span= %d \n Magic energy= %d \n Magic Wand = %s \n Spells= %s \n}",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                wand,
                spells);
    }

}


