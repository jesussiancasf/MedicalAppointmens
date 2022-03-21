import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //si no lo declaramos static, no podriamos usar el autoincrement
    static int id = 0;//autoincrement
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    private String speciality;


    Doctor() {
        System.out.println("Contruyendo el objeto doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("Tu nombre completp es " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println(name);
    }

    public void showID() {
        System.out.println("Id del doctor es " + id);
    }

    final ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;

    }


    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
