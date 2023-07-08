
package Coding;

public class Practice {

    public static void main(String[] args) {
        
        Student student1 = new Student ();
        Student student2 = new Student (12, "Lito Sebastian", "Gerez");
        
        System.out.println ("The student's ID is: " + student2.getId());
        System.out.println ("The student's name and surname are: " + student2.getName() + " " + student2.getSurname());
        
        System.out.println("---------------------------------");
        
        // student1 build
        
        student1.setId (13);
        student1.setName ("Ludmila Aylen");
        student1.setSurname ("Luna");
        
        //---------------------------------------
        
        System.out.println ("The student's ID is: " + student1.getId());
        System.out.println ("The student's name and surname are: " + student1.getName() + " " + student1.getSurname());
    }
    
}


