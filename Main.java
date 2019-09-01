package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String in1, in2, in3,in4,in5;
        int escoger=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("HOLA HIJO DE LA GRAN PUTA");
        Student peter=new Student("","","","",0);
        StudentManager Catalog=new StudentManager(null);
        Catalog.create();
        while (escoger!=4){
            System.out.println("");
            System.out.println("Que deseas realizar?");
            System.out.println("1. Ingresar voluntario");
            System.out.println("2. Imprimir todos los voluntarios");
            System.out.println("3. Anadir jornada");

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
                    System.out.println("Ingresa tu tipo de medico (General, Traumatologo y Emergencias): ");
                    in4 = scan.nextLine();
                    Catalog.addStudent(in1,in2,in4,in3);
                case 2:
                    Catalog.print(Catalog.getAll());
                case 3:
                    in5= scan.nextLine();
                    Catalog.addDate(in5,Catalog.getAll());
            }
        }


    }
}
