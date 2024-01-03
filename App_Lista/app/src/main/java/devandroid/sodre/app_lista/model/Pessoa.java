package devandroid.sodre.app_lista.model;

public class Pessoa {

    //Como definir um atributo:
    private String firstName;
    private String surname;
    private String desiredCourse;
    private String phone;

    //Métodos de acessos: Getter & Setter. Botão direito > Generate > Getter and Setter.

    //Construtor:
    public Pessoa(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDesiredCourse() {
        return desiredCourse;
    }

    public void setDesiredCourse(String desiredCourse) {
        this.desiredCourse = desiredCourse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
