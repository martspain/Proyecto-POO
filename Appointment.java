import java.util.*;
import java.lang.*;
import java.text.*;

public class Appointment {
    private String patientName;
    private String type;
    private String observations;

    public Appointment(String patientName, String type, String observations){
        this.observations = observations;
        this.type = type;
        this.patientName = patientName;
    }

    public String getType() {
        return type;
    }

    public String getObservations() {
        return observations;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getInfo(){
        String typeLine = "Tipo: " + this.type;
        String observationsLine = "Observaciones: " + this.observations;
        String patientLine = "Paciente: " + this.patientName;
        return typeLine + "\n" + observationsLine + "\n" + patientLine;
    }
}