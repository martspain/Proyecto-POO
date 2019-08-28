package com.company;

import java.util.ArrayList;

public class Voluntario {
    private String nombre;
    private String institucion;
    private int experiencia;
    private String telefono;

    public Voluntario (String nombre, String institucion, int experiencia, String telefono){
        this.nombre=nombre;
        this.institucion=institucion;
        this.experiencia=experiencia;
        this.telefono=telefono;
    }
    public ArrayList addVoluntario(String a, String b, int c, String d){
        ArrayList <Voluntario> listaVoluntario=new ArrayList<Voluntario>();
        listaVoluntario.add(new Voluntario(a,b,c,d));
        System.out.println("Se ha anadido a "+a+" exitosamente");
        return listaVoluntario;
    }
    public String getTodo(){
        return "Nombre: "+nombre+" Institucion: "+institucion+" Experiencia: "+experiencia+" Telefono: "+telefono;
    }
    public void imprimir(ArrayList a){
        for (Voluntario e: a){
            System.out.println(e.getTodo());
        }
    }

}
