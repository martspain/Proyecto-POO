package com.company;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList all;

    public StudentManager(ArrayList todo){
        this.all=all;
    }
    public ArrayList create(){
        ArrayList <Student> a= new ArrayList<Student>();
        this.all=a;
        return a;
    }
    public void addStudent(String a, String b, String c, String d){
        if(c.equalsIgnoreCase("General") ||c.equalsIgnoreCase("Traumatologo")||c.equalsIgnoreCase("Emergencias") ){
            all.add(new Student(a,b,c,d,0));
            System.out.println("Se ha anadido a "+a+" exitosamente");
        }
        else {
            System.out.println("Lo sentimos trata de ingresarte nuevamente");
        }
    }
    public void addDate(String NameStudent, ArrayList all){
        boolean ans = all.contains(NameStudent);

        if (ans)
            System.out.println("Hey there how are you");
        else
            System.out.println("Bien");
    }

    public ArrayList getAll(){
        return all;
    }

    public void print(ArrayList a){
        for(int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i));
            System.out.println("");
        }
    }
}
