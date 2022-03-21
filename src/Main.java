import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor=new Doctor("Jesùs Siancas","Dermatólogo");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient=new Patient("Alejandro Quevedo","alequeve@gmail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);

        patient.weight=60.5;//kg
        patient.height=1.65;//m

        System.out.println(patient.weight);
        System.out.println(patient.height);
    }


}
