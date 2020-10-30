package ar.com.ada.online.second.tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameActions {

    public static Character startGame() {

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
        Player1Wizard.setLocation(keyboard.nextInt());
        System.out.println("");

        Player1Wizard.setLifeSpan(100);
        Player1Wizard.setMagicEnergy(100);
        Player1Wizard.setTypeOfCharacter("wizard");
        Player1Wizard.setWand(WandWizard());

//        SpellSelection();
        return Player1Wizard;
    }

    //    metodo de varitas
    public static Wand WandWizard() {

        List<Wand> nWand = new ArrayList<>();
        nWand.add(new Wand(4, "Madera de serpiente: +4 attacking points"));
        nWand.add(new Wand(5, "Nogal negro: +5 attacking points"));
        nWand.add(new Wand(2, "Sauce: +2 attacking points"));
        nWand.add(new Wand(3, "Sauco: +3 attacking points"));
        nWand.add(new Wand(4, "Diamond: +4 attacking points"));
        nWand.add(new Wand(5, "Alamo temblon: +5 attacking points"));
        System.out.println("Magic wands:\n" + nWand + "\n");
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }

        Wand PlayerWand = new Wand();
        PlayerWand = nWand.get(random.nextInt(nWand.size()));
        System.out.println("The wand " + PlayerWand +" has selected you.");

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


    public static void SpellSelection() {

        Scanner keyboard = new Scanner(System.in);
        int option;

        System.out.println();
        System.out.println("ATTENTION !!!");
        System.out.println();
        System.out.println("You can only choose six spells in total");
        System.out.printf("Attacking Spells: \n { \n",
                "1.	BOMBARDA MAXIMA { attacks: 10, magic energy used: 5 }\n",
                "2. DESMAIUS { attacks: 15, magic energy used: 10 } \n",
                "3. EXPULSO { attacks: 20, magic energy used: 15 } \n",
                "4. LEVICORPUS { attacks: 10, magic energy used: 5 } \n",
                "5. REDUCTO { attacks: 20, magic energy used: 15 } \n",
                "6.	CONFRINGO { attacks: 15, magic energy used: 10 } \n",
                "7.	DEPRIMO { attacks: 10, magic energy used: 5 } \n",
                "8.	GLACIUS { attacks: 25, magic energy used: 20 } \n",
                "9.	INCENDIO { attacks: 25, magic energy used: 20 } \n",
                "10. AVADA KEDAVRA { attacks: 100, magic energy used: 90 } \n",
                "11. CRUCIATUS { attacks: 80, magic energy used: 70 } \n",
                "12. IMPERIUS { attacks: 90, magic energy used: 80} \n }\n"
        );
        System.out.printf("Healing Spells: \n { \n",
                "13. ANAPNEO { recovered life points: 20, magic energy used: 20 } \n",
                "14. BRAQUIAM EMENDO { recovered life points: 15, magic energy used: 20 }\n",
                "15. EPISKEY { recovered life points: 10, magic energy used: 15 }\n",
                "16. OSSIO DISPERSIMUS { recovered life points: 20, magic energy used: 20 }\n",
                "17. REPARIFORS { recovered life points: 10, magic energy used: 10 }\n",
                "18. FÉRULA { recovered life points: 15, magic energy used: 15 }\n",
                "19. VULNERA SANENTUR { recovered life points: 15, magic energy used: 15\n } \n"
        );
        System.out.printf("Recovery Spells: \n { \n",
                "20. RECUPERA { magic energy recovered: 15, magic energy used 3} \n } \n"
        );
        System.out.print("Option: ");
        option = keyboard.nextInt();
    }
}

