package ar.com.ada.online.second.tp1;

public class Main {

    public static void main(String[] args) {
        //Creacion de obj para guardar info de los jugadores
        Character player1;
        Character player2;


        //Guardamos las selecciones del jugador 1 y mostramos
        System.out.println("Player 1, you choose:");
        player1 = SelectionAction.selectionPart();
        System.out.println("Player 1 information: \n" + player1);

        //Guardamos las selecciones del jugador 2 y mostramos
        System.out.println("Player 2, you choose:");
        player2 = SelectionAction.selectionPart();
        System.out.println("Player 2 information: \n" + player2);

        //Empieza la partida
        System.out.println("The game begins");
        System.out.println("");
        player1.isDeadOrAlive();
        player2.isDeadOrAlive();
        do {
            System.out.println("\n \nPlayer 1, is your turn.");
            GameAction.castSpell(player1, player2);
            System.out.println("\n \nPlayer 2, is your turn.");
            GameAction.castSpell(player2, player1);
        } while (player1.isDeadOrAlive() || player2.isDeadOrAlive());

    }
}

