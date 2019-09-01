package com.company;

import java.util.ArrayList;

public class Student {
    private String type;
    private String name;
    private String institution;
    private String phone;
    private int dates;

    public Student (String name, String institution, String type, String phone, int dates){
        this.phone=phone;
        this.name=name;
        this.institution=institution;
        this.type=type;
        this.dates=dates;
    }

    public String toString(){
        return "\nNombre: "+name+"\nInstitucion: "+institution+"\ntipo: "+type+"\nTelefono: "+phone+"\nNumero de jornadas: "+dates;
    }

}
