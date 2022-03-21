import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor=new Doctor("Jesùs Siancas","Dermatólogo");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient=new Patient("Alejandro Quevedo","alequeve@gmail.com");
        patient.setWeight(65.2);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("55555555");
        System.out.println(patient.getPhoneNumber());
    }


}
