package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String in1, in2, in3,in4;
        int escoger=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("HOLA HIJO DE LA GRAN PUTA");
        Voluntario bob=new Voluntario("","","","");
        Other pedro=new Other(null);
        pedro.create();
        while (escoger!=3){
            System.out.println("");
            System.out.println("Que deseas realizar?");
            System.out.println("1. Ingresar voluntario");
            System.out.println("2. Imprimir");

            escoger = scan.nextInt();

            switch(escoger) {
                case 1:

                    System.out.println("Ingresa tu nombre: ");
                    scan.nextLine();
                    in1 = scan.nextLine();
                    System.out.println("Ingresa tu institucion: ");
                    in2 = scan.nextLine();
                    System.out.println("Ingresa tu telefono: ");
                    in3 = scan.nextLine();
                    System.out.println("Ingresa tu tipo de medico: ");
                    in4 = scan.nextLine();
                    pedro.addVoluntario(in1,in2,in4,in3);
                case 2:
                    pedro.imprimir(pedro.getTodo());
            }
        }


    }
}
