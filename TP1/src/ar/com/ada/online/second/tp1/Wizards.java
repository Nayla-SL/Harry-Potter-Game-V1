package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Wizards extends Character {
    protected String magicWand;

    //constructor


    public Wizards() {
    }

    // getters and setters

    public String getMagicWand() {
        return magicWand;
    }

    public void setMagicWand(String magicWand) {
        this.magicWand = magicWand;
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
        Wizards that = (Wizards) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                spells.equals(that.spells) &&
                typeOfCharacter.equals(that.typeOfCharacter) &&
                magicWand.equals(that.magicWand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, spells, typeOfCharacter, magicWand);
    }

    @Override
    public String toString() {
        return String.format(
                "Character{ Type of Character = %s \n Name= %s \n Location= %d \n Life span= %d \n Magic energy= %d \n Spells= %s \n Magic Wand = %s \n}",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                spells,
                magicWand);
    }

}


