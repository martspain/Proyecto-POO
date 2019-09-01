import java.util.*;
import java.lang.*;
import java.text.*;

public class StudentManager {
    ArrayList <Student> students = new ArrayList<Student>();
    View view;
    ArrayList <String> studentTypes = new ArrayList<String>(Arrays.asList("Traumatologo", "General", "Dermatologo"));


    public StudentManager (){
        view = new View();

        int numberOfStudents = this.view.intPositiveInput("Ingrese el numero de estudiantes", "Ingrese un numero valido");
        for (int i = 0; i < numberOfStudents ; i++) {
            view.print("Estudiante numero " + (i+1));
            String name = this.view.input("Ingrese el nombre:");
            String university = this.view.input("Ingrese la universidad:");
            String phone = this.view.input("Ingrese el numero de telefono:");
            String type = this.view.selectOptions(this.studentTypes, "Ingrese una especialidad");
            Student student = new Student(name, university, type, phone);
            this.students.add(student);
        }
    }
    public void addStudent(Student student){
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getStudentIndex(){
        int studentIndex = view.selectOptions(this.students, "Ingrese el numero de estudiante", "Ingrese algo valido");
        return studentIndex;
    }

    public void addAppointment(String type){
        int index = this.getStudentIndex();
        String patientName = this.view.input("Ingrese el nombre del paciente:");
        String observations = this.view.input("Ingrese las observaciones de la cita:");
        Appointment a = new Appointment(patientName, type, observations);
        this.students.get(index).addAppointment(a);
        view.print("Cita tipo " + type + " ingresada con exito");
    }

    public void showAppointments(){
        for (Student student: this.students) {
            view.print(student.toString());
            student.showAppointments();
            view.print("\n");
        }
    }
}
