package ar.com.ada.online.second.tp1;

import java.util.*;

public class GameActions {

    public static Character selectionPart() {

        Character auxiliar = new Character();
        Scanner keyboard = new Scanner(System.in);
        int option;
        System.out.println("Player one, you choose:");
        System.out.println("Digitize what character you want");
        System.out.println("1- Wizard");
        System.out.println("2- Elf");
        System.out.print("Option: ");
        option = keyboard.nextInt();

        switch (option) {
            case 1:
                //mago
                return gameWizard();// metodo de mago y las elecciones para el juego
            case 2:
                Elf Player1Elf = new Elf();
                gameElf(); //metodo de elfo y las elecciones para el juego
                SpellSelection();//metodo para elegir hechizos
                break;
            default:
                break;

        }


        System.out.print("\nPlayer 2, you choose: ");

        System.out.println("");

        return auxiliar;
    }

    public static Wizard gameWizard() {
        int option;

        Wizard Player1Wizard = new Wizard();
        Scanner keyboard = new Scanner(System.in);
        //selecciona mago
        System.out.print("Choose and type your name: ");
        Player1Wizard.setName(keyboard.next());
        System.out.println("");

        //selecciona ubicacion
        System.out.println("Select a location:");
        System.out.println("1) Hogwarts");
        System.out.println("2) Diagon Alley");
        System.out.println("3) Hogsmeade");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        switch (option) {
            case 1:
                Player1Wizard.setLocation("1) Hogwarts");
                break;
            case 2:
                Player1Wizard.setLocation("2) Diagon Alley");
                break;
            case 3:
                Player1Wizard.setLocation("3) Hogsmeade");
                break;
            default:
                System.out.println("You must choose a valid option");
                Player1Wizard.setLocation((String) null);
                break;
        }

        System.out.println("");

        Player1Wizard.setLifeSpan(100);
        Player1Wizard.setMagicEnergy(100);
        Player1Wizard.setTypeOfCharacter("Wizard");
        Player1Wizard.setWand(WandWizard());
        Player1Wizard.setSpells(SpellSelection());

        return Player1Wizard;
    }

    //    metodo de varitas
    public static Wand WandWizard() {

        List<Wand> nWand = new ArrayList<>();
        nWand.add(new Wand(4, "Madera de serpiente"));
        nWand.add(new Wand(5, "Nogal negro"));
        nWand.add(new Wand(2, "Sauce"));
        nWand.add(new Wand(3, "Sauco"));
        nWand.add(new Wand(4, "Diamond"));
        nWand.add(new Wand(5, "Alamo temblon"));
        System.out.printf("Magic wands:\n" +
                "Madera de serpiente: +4 attacking points \n" +
                "Nogal negro: +5 attacking points\n" +
                "Sauce: +2 attacking points \n" +
                "Sauco: +3 attacking points\n " +
                "Diamond: +4 attacking points\n" +
                "Alamo temblon: +5 attacking points\n"
        );
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }

        Wand PlayerWand = new Wand();
        PlayerWand = nWand.get(random.nextInt(nWand.size()));
        System.out.println("The wand " + PlayerWand + " has selected you.");

        return PlayerWand;

    }

    public static void gameElf() {
        String name;
        int option;
        Scanner keyboard = new Scanner(System.in);
        //selecciona Elf
        System.out.println("Choose and type your name: ");

        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print(" ");

        //selecciona ubicacion
        System.out.println("Select a locations:");
        System.out.println("1) Hogwarts");
        System.out.println("2) Diagon Alley");
        System.out.println("3) Hogsmeade");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.print("");

    }


    public static List<Spell> SpellSelection() {

        Scanner keyboard = new Scanner(System.in);
        int option;

        System.out.println();
        System.out.println("ATTENTION !!!");
        System.out.println();
        System.out.println("You can only choose six spells in total\n");
        System.out.printf("Attacking Spells { \n" +
                "1.	 BOMBARDA MAXIMA { attacks: 10, magic energy used: 5 }\n" +
                "2.  DESMAIUS { attacks: 15, magic energy used: 10 } \n" +
                "3.  EXPULSO { attacks: 20, magic energy used: 15 } \n" +
                "4.  LEVICORPUS { attacks: 12, magic energy used: 6 } \n" +
                "5.  REDUCTO { attacks: 20, magic energy used: 12 } \n" +
                "6.	 CONFRINGO { attacks: 15, magic energy used: 10 } \n" +
                "7.	 DEPRIMO { attacks: 10, magic energy used: 5 } \n" +
                "8.	 GLACIUS { attacks: 25, magic energy used: 20 } \n" +
                "9.	 INCENDIO { attacks: 25, magic energy used: 20 } \n" +
                "10. AVADA KEDAVRA { attacks: 100, magic energy used: 90 } \n" +
                "11. CRUCIATUS { attacks: 80, magic energy used: 70 } \n" +
                "12. IMPERIUS { attacks: 90, magic energy used: 80} \n }\n"
        );
        System.out.printf("Healing Spells { \n" +
                "13. ANAPNEO { recovered life points: 20, magic energy used: 20 } \n" +
                "14. BRAQUIAM EMENDO { recovered life points: 15, magic energy used: 18 }\n" +
                "15. EPISKEY { recovered life points: 10, magic energy used: 15 }\n" +
                "16. OSSIO DISPERSIMUS { recovered life points: 20, magic energy used: 18 }\n" +
                "17. REPARIFORS { recovered life points: 10, magic energy used: 10 }\n" +
                "18. FÉRULA { recovered life points: 15, magic energy used: 15 }\n" +
                "19. VULNERA SANENTUR { recovered life points: 15, magic energy used: 15\n } \n"
        );
        System.out.printf("Recovery Spells { \n" +
                "20. RECUPERA { magic energy recovered: 15, magic energy used 3} \n } \n"
        );



        List<Spell> PlayerChosenSpells = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            System.out.println("Choose your spell number " + (i + 1));
            System.out.print("Option: ");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
//                    ((AttackSpell) PlayerChosenSpells).setName("BOMBARDA MAXIMA");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(5);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(10);
                    PlayerChosenSpells.add(new AttackSpell("BOMBARDA MAXIMA", 5, 10));
                    break;
                case 2:
//                    ((AttackSpell) PlayerChosenSpells).setName("DESMAIUS");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(10);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(15);
                    PlayerChosenSpells.add(new AttackSpell("DESMAIUS", 10, 15));
                    break;
                case 3:
//                    ((AttackSpell) PlayerChosenSpells).setName("EXPULSO");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(15);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(20);
                    PlayerChosenSpells.add(new AttackSpell("EXPULSO", 15, 20));
                    break;
                case 4:
//                    ((AttackSpell) PlayerChosenSpells).setName("LEVICORPUS");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(5);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(10);
                    PlayerChosenSpells.add(new AttackSpell("LEVICORPUS", 6, 12));
                    break;
                case 5:
//                    ((AttackSpell) PlayerChosenSpells).setName("REDUCTO");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(12);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(20);
                    PlayerChosenSpells.add(new AttackSpell("REDUCTO", 12, 20));
                    break;
                case 6:
//                    ((AttackSpell) PlayerChosenSpells).setName("DEPRIMO");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(5);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(10);
                    PlayerChosenSpells.add(new AttackSpell("DEPRIMO", 5, 10));
                    break;
                case 7:
//                    ((AttackSpell) PlayerChosenSpells).setName("GLACIUS");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(20);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(25);
                    PlayerChosenSpells.add(new AttackSpell("GLACIUS", 20, 25));
                    break;
                case 8:
//                    ((AttackSpell) PlayerChosenSpells).setName("INCENDIO");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(20);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(25);
                    PlayerChosenSpells.add(new AttackSpell("INCENDIO", 20, 25));
                    break;
                case 9:
//                    ((AttackSpell) PlayerChosenSpells).setName("AVADA KEDAVRA");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(90);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(100);
                    PlayerChosenSpells.add(new AttackSpell("AVADA KEDAVRA", 90, 100));
                    break;
                case 10:
//                    ((AttackSpell) PlayerChosenSpells).setName("CRUCIATUS");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(70);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(80);
                    PlayerChosenSpells.add(new AttackSpell("CRUCIATUS", 70, 80));
                    break;
                case 11:
//                    ((AttackSpell) PlayerChosenSpells).setName("IMPERIUS");
//                    ((AttackSpell) PlayerChosenSpells).setMagicEnergySpent(80);
//                    ((AttackSpell) PlayerChosenSpells).setDamageMade(90);
                    PlayerChosenSpells.add(new AttackSpell("IMPERIUS", 80, 90));
                    break;
                case 12:
//                    ((HealingSpell) PlayerChosenSpells).setName("ANAPNEO");
//                    ((HealingSpell) PlayerChosenSpells).setMagicEnergySpent(20);
//                    ((HealingSpell) PlayerChosenSpells).setLifeRecovered(20);
                    PlayerChosenSpells.add(new HealingSpell("ANAPNEO", 20, 20));
                    break;
                case 13:
//                    ((HealingSpell) PlayerChosenSpells).setName("BRAQUIAM EMENDO");
//                    ((HealingSpell) PlayerChosenSpells).setMagicEnergySpent(20);
//                    ((HealingSpell) PlayerChosenSpells).setLifeRecovered(15);
                    PlayerChosenSpells.add(new HealingSpell("BRAQUIAM EMENDO", 18, 15));
                    break;
                case 14:
//                    ((HealingSpell) PlayerChosenSpells).setName("EPISKEY");
//                    ((HealingSpell) PlayerChosenSpells).setMagicEnergySpent(15);
//                    ((HealingSpell) PlayerChosenSpells).setLifeRecovered(10);
                    PlayerChosenSpells.add(new HealingSpell("EPISKEY", 15, 10));
                    break;
                case 15:
//                    ((HealingSpell) PlayerChosenSpells).setName("OSSIO DISPERSIMUS");
//                    ((HealingSpell) PlayerChosenSpells).setMagicEnergySpent(18);
//                    ((HealingSpell) PlayerChosenSpells).setLifeRecovered(20);
                    PlayerChosenSpells.add(new HealingSpell("OSSIO DISPERSIMUS", 18, 20));
                    break;
                case 16:
//                    ((HealingSpell) PlayerChosenSpells).setName("REPARIFORS");
//                    ((HealingSpell) PlayerChosenSpells).setLifeRecovered(10);
//                    ((HealingSpell) PlayerChosenSpells).setMagicEnergySpent(10);
                    PlayerChosenSpells.add(new HealingSpell("REPARIFORS", 10, 10));
                    break;
                case 17:
//                    ((HealingSpell) PlayerChosenSpells).setName("FERULA");
//                    ((HealingSpell) PlayerChosenSpells).setMagicEnergySpent(15);
//                    ((HealingSpell) PlayerChosenSpells).setLifeRecovered(15);
                    PlayerChosenSpells.add(new HealingSpell("FERULA", 15, 15));
                    break;
                case 18:
//                    ((HealingSpell) PlayerChosenSpells).setName("VULNERA SANENTUR");
//                    ((HealingSpell) PlayerChosenSpells).setMagicEnergySpent(16);
//                    ((HealingSpell) PlayerChosenSpells).setLifeRecovered(20);
                    PlayerChosenSpells.add(new HealingSpell("VULNERA SANENTUR", 16, 20));
                    break;
                case 19:
//                    ((RecoverySpell) PlayerChosenSpells).setName("RECUPERA");
//                    ((RecoverySpell) PlayerChosenSpells).setMagicEnergySpent(3);
//                    ((RecoverySpell) PlayerChosenSpells).setEnergyRecovered(15);
                    PlayerChosenSpells.add(new RecoverySpell("RECUPERA", 3, 15));
                    break;
            }
            System.out.println("You can choose " + (6 - (i + 1)) + " more spells.");
        }
        return PlayerChosenSpells;
    }
}

