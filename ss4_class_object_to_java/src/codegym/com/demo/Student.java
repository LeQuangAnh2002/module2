package codegym.com.demo;

public class Student {
    private String name, classes;
    public Student(){
        name = "John";
        classes = "CO2";
    }
    public void setName(String name){
        this.name  = name;

    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public String getName(){
        return this.name;
    }
    public String getClasses(){
        return this.classes;
    }
}
