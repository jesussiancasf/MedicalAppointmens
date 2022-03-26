import models.Doctor;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Jesùs Siancas", "jes@platzi.com", "Dermatólogo");
        myDoctor.setAddress("Calle 3");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

     /*   for (models.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()
        ) {
            System.out.println(aA.getDate()+" "+aA.getTime());
        }

        models.Patient p= new models.Patient("Luis Suarez","lui@gmail.com");
        System.out.println(p);*/
        System.out.println(myDoctor);
    }


}
