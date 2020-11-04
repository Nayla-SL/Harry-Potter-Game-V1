package ar.com.ada.online.second.tp1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Character Player1 = new Character();
        Character Player2 = new Character();
        System.out.println("The game begins");
        System.out.println("");
        Player1 = GameActions.selectionPart();


        System.out.println(Player1);

    }
}

