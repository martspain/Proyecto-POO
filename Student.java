import java.util.*;
import java.lang.*;
import java.text.*;


public class Student {
    private String name;
    private String university;
    private String type;
    private String phone;
    View view;
    ArrayList <Appointment> appointments = new ArrayList<Appointment>();

    public Student (String name, String univesity, String type, String phone){
        this.name=name;
        this.university=univesity;
        this.type=type;
        view = new View();
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPhone() {
        return phone;
    }

    public String getUniversity() {
        return university;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
    public ArrayList<Appointment> getAppointmentsFiltered(String filter) {
        ArrayList <Appointment> appointmentsFiltered = new ArrayList<Appointment>();
        for (Appointment appointment: this.appointments) {
            if (appointment.getType().equals(filter))
                appointmentsFiltered.add(appointment);
        }
        return appointmentsFiltered;
    }

    public void showAppointments() {
        if (this.appointments.isEmpty()){
            view.print("No tiene citas.\n");
        }else{
            for (Appointment appointment: this.appointments) {
                view.print(appointment.getInfo()+"\n");
            }
        }
    }

    public void addAppointment(Appointment appointment){
        this.appointments.add(appointment);
    }


    public String toString(){
        return this.name + " - " + this.university;
    }


}
