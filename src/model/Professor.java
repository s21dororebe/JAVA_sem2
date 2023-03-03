package model;

import java.util.Objects;

public class Professor {
    private long id;
    private String name;
    private String surname;
    private Degree degree;

    private static long professorCounter = 0;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String inputName) {
        if (inputName != null && inputName.matches("[A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+[ ]?([A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+)?") )
            name = inputName;
        else
            name = "Unknown";
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String inputSurname) {
        if(inputSurname != null && inputSurname.matches("[A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+([-][A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+)?"))
            surname = inputSurname;
        else
            surname = "Unknown";
    }

    public Degree getDegree() {
        return degree;
    }
    public void setDegree(Degree inputDegree) {
        degree = Objects.requireNonNullElse(inputDegree, Degree.UNKNOWN);
    }

    public void setId(){
        id = professorCounter++;
    }

    public Professor(){
        setId();
        setName("Unknown");
        setSurname("Unknown");
        setDegree(Degree.UNKNOWN);
    }
    public Professor(String name, String surname, Degree degree) {
        setId();
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }
    public String toString() {
        return "" + id + ": " + name + " " + surname + ", " + degree;
    }

}
