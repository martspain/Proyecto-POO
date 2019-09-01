package com.company;

import java.util.ArrayList;

public class Other {
    private ArrayList todo;

    public Other(ArrayList todo){
        this.todo=todo;
    }
    public ArrayList create(){
        ArrayList <Voluntario> a= new ArrayList<Voluntario>();
        this.todo=a;
        return a;
    }
    public void addVoluntario(String a, String b, String c, String d){
        todo.add(new Voluntario(a,b,c,d));
        System.out.println("Se ha anadido a "+a+" exitosamente");
    }
    public ArrayList getTodo(){
        return todo;
    }

    public void imprimir(ArrayList a){
        for(int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            System.out.println("");
        }
    }
    }
