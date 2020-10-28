package ar.com.ada.online.second.tp1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameActions {

    public static void startGame() {

        Scanner keyboard = new Scanner(System.in);
        int option;
        char response;
        do {
            do {
                System.out.println("Player one, you choose:");
                System.out.println("Digitize what character you want");
                System.out.println("1- Wizard");
                System.out.println("2- Elf");
                System.out.print("Option: ");
                option = keyboard.nextInt();

            } while (option < 1 || option > 2);
            switch (option) {
                case 1:
                    //mago
                    gameWizard();// metodo de mago y las elecciones para el juego
                    System.out.println();
                    WandWizard();//metodo de las varitas
                    TypeOfSpell();//metodo para elegir hechizos

                    break;
                case 2:

                    gameElf(); //metodo de elfo y las elecciones para el juego
                    Spell.TypeOfSpell();//metodo para elegir hechizos
                    break;
            }
            System.out.print("\nYou want to introduce another participant(s/n: ");
            response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char

            System.out.println("");

        } while (response == 's' || response == 'S');

    }

    public static void gameWizard() {
        int option;
        String name;
        Scanner keyboard = new Scanner(System.in);
        //selecciona mago
        System.out.print("Choose and type your name: ");
        name = keyboard.next();
        System.out.println("");

        //selecciona ubicacion
        System.out.println("Select a location:");
        System.out.println("1) Hogwarts");
        System.out.println("2) Diagon Alley");
        System.out.println("3) Hogsmeade");
        System.out.print("Option: ");
        option = keyboard.nextInt();
        System.out.println("");

    }

    //metodo de varitas
    public static void WandWizard() {

        ArrayList<String> nWand = new ArrayList<String>();

        nWand.add("Madera de serpiente: +4 attacking points");
        nWand.add("Nogal negro: +5 attacking points");
        nWand.add("Sauce: +2 attacking points");
        nWand.add("Sauco: +3 attacking points");
        nWand.add("Diamond: +4 attacking points");
        nWand.add("Alamo temblon: +5 attacking points");
        System.out.println("Magic wands:\n" + nWand);
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }

        System.out.println("The wand " + nWand.get(random.nextInt(nWand.size())) + " has selected you.");
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


    public static void TypeOfSpell() {

        Scanner keyboard = new Scanner(System.in);
        int option;
        char response;

        System.out.println("");
        System.out.println("ATTENTION !!!");
        System.out.println("");
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
                "12. IMPERIUS { attacks: 90, magic energy used: 80} \n } \n"
        );
        System.out.printf("Healing Spells: \n { \n",
                "13. ANAPNEO LP 20 ME 20 \n",
                "14. BRAQUIAM EMENDO LP 15 ME 20\n",
                "15. EPISKEY LP 10 ME 15\n",
                "16. OSSIO DISPERSIMUS LP 20 ME 20\n",
                "17. REPARIFORS LP 10 ME 10\n",
                "18. FÉRULA LP 15 ME 15\n",
                "19. VULNERA SANENTUR LP 15 ME 15\n } \n"
        );
        System.out.print("Option: ");
        option = keyboard.nextInt();
    }
}
}
