package ar.com.ada.online.second.tp1;

import java.util.Objects;

public class Elf extends Character {
    protected boolean freeElf;

    public boolean isFreeElf() {
        return freeElf;
    }

    public void setFreeElf(boolean freeElf) {
        this.freeElf = freeElf;
    }

    public void isFreeOrNot() {
        int counterAttackSpells = 0;
        for (int i = 0; i < this.spells.size(); i++) {
            if (this.spells.get(i) instanceof AttackSpell)
                counterAttackSpells++;
        }
        freeElf = (counterAttackSpells > 3);
    }

    // Overrides

    @Override
    public void configSpells() {
        if (freeElf) {
            for (int i = 0; i < this.spells.size(); i++) {
                if (this.spells.get(i) instanceof AttackSpell) {
                    AttackSpell attackSpell = (AttackSpell) this.spells.get(i);
                    attackSpell.setDamageMade(attackSpell.getDamageMade() + 5);
                }
                if (this.spells.get(i) instanceof HealingSpell) {
                    HealingSpell healingSpell = (HealingSpell) this.spells.get(i);
                    healingSpell.setLifeRecovered(healingSpell.getLifeRecovered() + 5);
                }
                if (this.spells.get(i) instanceof RecoverySpell) {
                    RecoverySpell recoverySpell = (RecoverySpell) this.spells.get(i);
                    recoverySpell.setEnergyRecovered(recoverySpell.getEnergyRecovered() + 5);
                }
            }
        } else {
            for (int i = 0; i < this.spells.size(); i++) {
                if (this.spells.get(i) instanceof HealingSpell) {
                    HealingSpell healingSpell = (HealingSpell) this.spells.get(i);
                    healingSpell.setLifeRecovered(healingSpell.getLifeRecovered() + 10);

                }
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elf that = (Elf) obj;
        return location == that.location &&
                name.equals(that.name) &&
                lifeSpan.equals(that.lifeSpan) &&
                magicEnergy.equals(that.magicEnergy) &&
                typeOfCharacter.equals(that.typeOfCharacter) &&
                spells.equals(that.spells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, lifeSpan, magicEnergy, typeOfCharacter, spells);
    }

    @Override
    public String toString() {

        String output = String.format(
                "Character{ \n Type of Character: %s \n Name: %s  Location: %s \n Life span: %d \n Magic energy: %d \n Spells: \n}",
                typeOfCharacter,
                name,
                location,
                lifeSpan,
                magicEnergy);
        String spellsTxt = "\n\t";
        for (int i = 0; i < spells.size(); i++) {
            spellsTxt = "\t" + spellsTxt + spells.get(i).toString() + "\n";
        }
        output = output + spellsTxt;
        return output;

    }


}
