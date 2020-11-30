package ar.com.ada.online.second.tp1;

import javax.swing.plaf.metal.MetalBorders;
import java.io.PushbackReader;
import java.util.Scanner;

public class GameAction {

    public static void castSpell(Character userPlaying, Character otherPlayer) {

        Scanner keyboard = new Scanner(System.in);
        int locationOpponentInt;
        String locationOpponent;
        int spellSelected;
        if (userPlaying.isDeadOrAlive()) {
            System.out.println("This is your status now:");
            System.out.println(userPlaying);
            System.out.println();
            System.out.print("Choose the spell you want to do: ");
            spellSelected = keyboard.nextInt();
            if (userPlaying.spells.get(spellSelected - 1) instanceof AttackSpell) {
                AttackSpell attackSpell = (AttackSpell) userPlaying.spells.get(spellSelected - 1);
                if (userPlaying.getMagicEnergy() < attackSpell.getMagicEnergySpent()) {
                    System.out.println("Your magic energy is not enough for this spell. You loose your turn and gain +10 magic energy points.");
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + 10);
                } else {
                    userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() - attackSpell.getMagicEnergySpent());
                    System.out.println("Choose the location you want to throw your spell to");
                    locationOpponent = SelectionAction.LocationSelection();
                    if (locationOpponent == otherPlayer.getLocation()) {
                        otherPlayer.setLifeSpan(otherPlayer.getLifeSpan() - attackSpell.getDamageMade());
                        System.out.println("Great! You hit your target.");
                    } else {
                        System.out.println("Sorry, you did not hit your target.");
                    }
                }

                if (userPlaying.spells.get(spellSelected - 1) instanceof HealingSpell) {
                    HealingSpell healingSpell = (HealingSpell) userPlaying.spells.get(spellSelected - 1);
                    if (userPlaying.getMagicEnergy() < healingSpell.getMagicEnergySpent()) {
                        System.out.println("Your magic energy is not enough for this spell. You loose your turn and gain +10 magic energy points.");
                        userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + 10);
                    } else {
                        userPlaying.setLifeSpan(userPlaying.getLifeSpan() + healingSpell.getLifeRecovered());
                        userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() - healingSpell.getMagicEnergySpent());
                        if (userPlaying.getLifeSpan() > 100)
                            userPlaying.setLifeSpan(100);
                    }
                }
                if (userPlaying.spells.get(spellSelected - 1) instanceof RecoverySpell) {
                    RecoverySpell recoverySpell = (RecoverySpell) userPlaying.spells.get(spellSelected - 1);
                    if (userPlaying.getMagicEnergy() < recoverySpell.getMagicEnergySpent()) {
                        System.out.println("Your magic energy is not enough for this spell. You loose your turn and gain +10 magic energy points.");
                        userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + 10);
                    } else {
                        userPlaying.setMagicEnergy(userPlaying.getMagicEnergy() + recoverySpell.getEnergyRecovered() - recoverySpell.getMagicEnergySpent());
                        if (userPlaying.getMagicEnergy() > 100)
                            userPlaying.setMagicEnergy(100);
                    }
                }
            } else {
                System.out.println(" Sorry, you are dead. \n You lost! \n The game ends.");
                System.exit(0);
            }
            if (otherPlayer.getLifeSpan() <= 0) {
                System.out.println(" Your opponent is dead. \n You win! \n The game ends.");
                System.exit(0);
            }
            System.out.println("Now you can change your location if you want.");

            userPlaying.setLocation(SelectionAction.LocationSelection());
            System.out.printf("Here's your status: \n Name: %s \n Location: %s \n Life span: %d \n Magic energy: %d \n",
                    userPlaying.getName(),
                    userPlaying.getLocation(),
                    userPlaying.getLifeSpan(),
                    userPlaying.getMagicEnergy()
            );
        }
    }
}




