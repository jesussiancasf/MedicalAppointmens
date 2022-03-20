public class Doctor {
    //si no lo declaramos static, no podriamos usar el autoincrement
    static int id=0;//autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Contruyendo el objeto doctor");
        id++;
    }
    Doctor(String name){
        //this.name=name;
        System.out.println("Tu nombre completp es "+name);
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showID(){
        System.out.println("Id del doctor es "+id);
    }
}
