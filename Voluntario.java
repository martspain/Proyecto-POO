package com.company;

import java.util.ArrayList;

public class Voluntario {
    private String tipo;
    private String nombre;
    private String institucion;
    private String telefono;

    public Voluntario (String nombre, String institucion, String tipo, String telefono){
        this.nombre=nombre;
        this.institucion=institucion;
        this.tipo=tipo;
        this.telefono=telefono;
    }

    public String toString(){
        return "\nNombre: "+nombre+"\nInstitucion: "+institucion+"\ntipo: "+tipo+"\nTelefono: "+telefono;
    }

}
