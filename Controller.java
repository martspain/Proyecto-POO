import java.util.*;
import java.lang.*;
import java.text.*;


public class Controller {
    boolean active = true;
    View view;
    ArrayList <String> menu = new ArrayList<String>(
            Arrays.asList("Solicitar jornada", "Contacto", "Emergencia", "Ver jornadas por voluntario", "Salir"
            ));
    StudentManager studentManager;

    public Controller (){
       view = new View();
       studentManager = new StudentManager();
    }

    public void menu(){
        while (this.active){
            String option = view.selectOptions(menu, "Ingrese una opcion de menu valida");
            if (option.equals("Solicitar jornada"))
                this.addAppointmentRoute("normal");
            else if(option.equals("Contacto"))
                this.showContact();
            else if(option.equals("Emergencia"))
                this.addAppointmentRoute("emergencia");
            else if(option.equals("Ver jornadas por voluntario"))
                this.showAppointments();
            else
                this.active = false;
        }
        view.print("Gracias por usar el programa.");
    }

    public void addAppointmentRoute(String type){
        this.studentManager.addAppointment(type);
    }

    public void showContact(){
        view.print("Numero - 12345678");
        view.print("email - fundacion@uvg.edu.gt");
        view.print("website - www.web.edu.gt");
    }

    public void showAppointments(){
        this.studentManager.showAppointments();
    }

}
