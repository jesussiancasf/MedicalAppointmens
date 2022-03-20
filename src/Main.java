import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Fernando Delgado";
        myDoctor.showName();
        myDoctor.showID();
        Doctor myDoctorJesus = new Doctor();
        myDoctorJesus.showID();

        showMenu();
    }


}
