public class Student {
  
    String name;
    int id;
    String major;
    String email;

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Major: " + major);
        System.out.println("Email: " + email);
        System.out.println("------------------------------");
    }
    public void study() {
       System.out.println("the student "+ name + " is studying OOP");
    }
}