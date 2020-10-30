package ar.com.ada.online.second.tp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("The game begins");
        System.out.println("");


        //metodo de varitas


        int auxiliarInt;
//        ArrayList<String> nWand = new ArrayList<String>();
//
//        nWand.add("Madera de serpiente: +4 attacking points");
//        nWand.add("Nogal negro: +5 attacking points");
//        nWand.add("Sauce: +2 attacking points");
//        nWand.add("Sauco: +3 attacking points");
//        nWand.add("Diamond: +4 attacking points");
//        nWand.add("Alamo temblon: +5 attacking points");
//        System.out.println("Magic wands:\n" + nWand);
//        System.out.println();
//        Random random = new Random();
//        for (int i = 0; i < nWand.size(); i++) {
//
//        }
        List<Wands> nWand = new ArrayList<>();
        nWand.add(new Wands(4, "Madera de serpiente: +4 attacking points"));
        nWand.add(new Wands(5, "Nogal negro: +5 attacking points"));
        nWand.add(new Wands(2, "Sauce: +2 attacking points"));
        nWand.add(new Wands(3, "Sauco: +3 attacking points"));
        nWand.add(new Wands(4, "Diamond: +4 attacking points"));
        nWand.add(new Wands(5, "Alamo temblon: +5 attacking points"));
        System.out.println("Magic wands:\n" + nWand);
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }

        nWand.get(random.nextInt(nWand.size()));
        System.out.println("The wand " + " has selected you.");

        auxiliarInt = 1;

        //faltaria guardar que varita le toca a cada jugador, porque segun la varita le suma puntos de ataque


    }
}

