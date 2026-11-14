public class MainApp {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.name = "Ahmed";
        student1.id = 2026001;
        student1.major = "Computer Engineering";

        Student student2 = new Student();
        student2.name = "Sara";
        student2.id = 2026002;
        student2.major = "Cybersecurity";


        student1.displayInfo();
        student2.displayInfo();
    }
}