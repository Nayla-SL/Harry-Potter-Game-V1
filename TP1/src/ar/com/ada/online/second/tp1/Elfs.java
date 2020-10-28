package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Elfs extends Character {


    //methods

    public boolean isFreeOrNot(boolean freeElf, int counterAttackSpells) {
        for (int i = 0; i < 6; i++) {
            switch (spells.getClass().getSimpleName()) {
                case "Attack":
                    counterAttackSpells++;
                default:
                    counterAttackSpells = counterAttackSpells;
            }
        }
        if (counterAttackSpells > 3) {
            freeElf = true;
        } else {
            freeElf = false;
        }

        return freeElf;
    }


    // Overrides

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elfs that = (Elfs) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                spells.equals(that.spells) &&
                typeOfCharacter.equals(that.typeOfCharacter) &&
                Spells.equals(that.Spells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, spells, typeOfCharacter, Spells);
    }

    @Override
    public String toString() {
        return String.format(
                "Character{ Type of Character = %s \n Name= %s \n Life span= %d \n Magic energy= %d \n Spells= %s \n Location= %d \n}",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy,
                Spells);
    }


}
