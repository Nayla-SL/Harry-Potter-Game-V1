package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Wizards extends Character{
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

    public void isDarkOrNot (boolean darkWizard){

    }




    // Overrides

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wizards that = (Wizards) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                spells.equals(that.spells) &&
                magicWand.equals(that.magicWand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, spells, magicWand);
    }

    @Override
    public String toString() {
        return String.format(
                "Character{ Name= %s \n Location= %d \n Life span= %d \n Magic energy= %d \n Spells= %s \n Magic Wand = %s \n}",
                name,
                location,
                lifeSpan,
                magicEnergy,
                spells,
                magicWand);
    }

}




}
