package model;

public class Student {
    //1. variables
    private long id;
    private String name, lastName;
    private Faculty faculty;
    private String personCode;
    //static to be stable and it does not matter how many students are created
    //students creation does not depend on this variable
    private static long studentCounter = 0;


    //2. getters and setters
    public long getId(){
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    //ToDo take a look regex101.com
    /// [A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+[ ]?([A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+)?
    public void setName(String inputName) {
        if (inputName != null && inputName.matches("[A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+[ ]?([A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+)?") )
            name = inputName;
        else
            name = "Unknown";
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String inputLastName) {
        if(inputLastName != null && inputLastName.matches("[A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+([-][A-ZĀĒŖŪĪĻĶĢŠŽČŅ]{1}[a-zēŗūīļķģšāžčņ]+)?"))
            lastName = inputLastName;
        else
            lastName = "Unknown";

    }
    public Faculty getFaculty() {
        return faculty;
    }
    public void setFaculty(Faculty inputFaculty) {
        if(inputFaculty != null)
            faculty = inputFaculty;
        else
            faculty = Faculty.UNKNOWN;
    }
    public String getPersonCode() {
        return personCode;
    }
    //old person code ([1-9]{1}[0-9]{5}[-][1-9]{1}[0-9]{4})
    //new person code ([32]{1}[0-9]{9})
    //Todo try to combine old and new regex
    public void setPersonCode(String inputPersonCode) {
        if (inputPersonCode != null && inputPersonCode.matches("[1-9]{1}[0-9]{5}[-][1-9]{1}[0-9]{4}"))
            personCode = inputPersonCode;
        else
            personCode = "000000-00000";
    }

    public static long getStudentCounter() {
        return studentCounter;
    }
    public void setId(){
        id = studentCounter++;
    }

    //3. constructors
    //4. toString
    //5. additional functions
}
