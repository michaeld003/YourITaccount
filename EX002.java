import java.util.Scanner; // we are importing the scanner module class so the user can input their data


public class EX002 extends Module { //this means the EX002 class will have Module's methods
    public EX002(String name, int status){ // This means that the EX002 class is accessible to other classes.
        super("EX002", 1);
        this.finalMark = 0;




    }
    public void setExam2(){
        System.out.println ("Enter Exam mark"); // this will print out this message
        Scanner scanner = new Scanner(System.in); // we are using a Scanner object to read user input
        int Exam = scanner.nextInt(); // the integer value for the exam
        finalMark = Exam; // finalMark variable is assigned to the exam which is inputted by the user
    }
}
