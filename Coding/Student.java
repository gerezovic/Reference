package Coding;


public class Student {
    
    int id;
    String name;
    String surname;
    
    public Student () {}
    public Student (int id, String name, String surname) {
        
        this.id = id;
        this.name = name;
        this.surname = surname;
        
    }
    
    public int getId ()  {
        return id; 
    }
    
    public void setId (int id) {
        this.id = id;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public String getSurname () {
        return surname;
    }
    
    public void setSurname (String surname) {
        this.surname = surname;
    }
    
    public void presentation () {
    
        System.out.println ("Hello, I'm a student");
    
    }
    
    public void fate (double score) {
    
    if (score >= 7) {
    
        System.out.println ("Yay, I've passed!");
    
    } else {
    
        System.out.println ("I've failed, shit. You motherfuckers are gonna pay for this offense against my person!");
    
    }
    
    }

    
}