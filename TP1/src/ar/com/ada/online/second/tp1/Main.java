package ar.com.ada.online.second.tp1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Character Player1;
        Character Player2;
        System.out.println("The game begins");
        System.out.println("");
        System.out.println("Player 1, you choose:");
        Player1 = SelectionActions.selectionPart();
        System.out.println("Player 1 information: \n" + Player1);

        System.out.println("Player 2, you choose:");
        Player2 = SelectionActions.selectionPart();
        System.out.println("Player 2 information: \n" + Player2);





    }
}

