import java.util.Date;

import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jesùs Siancas", "jes@platzi.com","Dermatólogo");
        myDoctor.setAddress("Calle 3");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()
        ) {
            System.out.println(aA.getDate()+" "+aA.getTime());
        }

        Patient p= new Patient("Luis Suarez","lui@gmail.com");
        System.out.println(p);
    }


}
