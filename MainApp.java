public class MainApp {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.name = "Ahmed";
        student1.id = 2026001;
        student1.major = "Computer Engineering";
        student1.email = "ahmed@GMAIL.com";

        Student student2 = new Student();
        student2.name = "Sara";
        student2.id = 2026002;
        student2.major = "Cybersecurity";
        student2.email = "sara@GMAIL.com";

        Student student3 = new Student();
        student3.name = "idris";
        student3.id = 39467806;
        student3.major = "Computer Science";
        student3.email = "idris@GMAIL.com";

       

        student1.displayInfo();
        student1.major = "Artificial Intelligence";
        student2.displayInfo();
         student3.displayInfo();
          student1.displayInfo();
          student2.study();
    }
}