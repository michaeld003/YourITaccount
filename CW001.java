import java.util.Scanner; // we are importing the scanner module class so the user can input their data
public class CW001 extends Module{ //this means the CW001 class will have Module's methods
    private double[] homeworkmarks = new double[3];  // this where the homeworkmarks are stored in
    private double FINALPROJECTMARK; // this is where the FINALPROJECTMARK is stored in




    public CW001(String name, int status) { // the CW001 class is accessible to other classes and it has 2 arguments String name and int status
        super(name, 0); // the constructor of the super  module with the 2 parameters of name and 0
        this.homeworkmarks = getHOMEWORKMARKS1(); //this will return the homeworkmarks
    }
    public double[] getHOMEWORKMARKS1() { // we are defining a method for the getHOMEWORKMARKS1
        return homeworkmarks;// It will return the homeworkmarks
    }
    public double[] setHomeworkMarks1() { // we are defining a method for the getHOMEWORKMARKS1
        for (int i=0; i<3; i++){ // through the use of a for loop we are going to make sure that the user inputs 3 marks
            System.out.println ("Enter homework marks"); // it will print this message
            Scanner scanner = new Scanner(System.in); //we are using a Scanner object to read user input
            int HW = scanner.nextInt(); // the integer value marks for the HW
            homeworkmarks[i] = HW; //assigning those values into the variable homeworkmarks
        }
        return homeworkmarks; // it will return the homeworkmarks
    }
    public double getProjectMark() { // we are creating another method called getProjectMark
        return FINALPROJECTMARK; // it will return the FINALPROJECTMARK
    }
    public void setProjectMark() { // we are creating another method called setProjectMark
        System.out.println ("Enter Final Project mark"); // this will be printed to the users screen
        Scanner scanner = new Scanner(System.in); //we are using a Scanner object to read user input
        int PR = scanner.nextInt();
        FINALPROJECTMARK = PR; // this will return us the  FINALPROJECTMARK


    }
    public void calculateFinalMark1() { // we are creating another method for calculateFinalMark1
        double TOTALHM = 0; //the variable TOTALHM is set at 0 originally
        for (double homeworkmark : homeworkmarks) { //for loop for the homeworkmarks
            TOTALHM += homeworkmark; // it will add each homeworkmark
        }
        double averagehm = TOTALHM / homeworkmarks.length; // this to calculate the average mark for the homework
        double finalmark = (0.5 * averagehm) + (0.5 * FINALPROJECTMARK); // formula to calculate the finalmark
        setFinalMark((int) finalmark);
        setFinalExam((int) averagehm);
    }
}