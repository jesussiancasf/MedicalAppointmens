package models;

public class Nurse extends User {

    private String speciallity;

    public Nurse(String nombre, String email) {
        super(nombre, email);
    }

    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }
}
