package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Elfs extends Character {


    //methods

    public void isFreeOrNot (boolean freeElf){

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
                typeOfCharacter.equals(that.typeOfCharacter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, spells, typeOfCharacter);
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
                spells);
    }


}
