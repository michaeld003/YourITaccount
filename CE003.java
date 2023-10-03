import java.util.Scanner; // we are importing the scanner module class so the user can input their data


public class CE003 extends Module { //this means the CE003 class will have Module's methods
    private double[] homeworkmarks = new double[4]; // this means that variable homeworkmarks is only accessible to this class. The double is just a data to store decimal points(up  to 15) in this case for the homeworkmarks,which will take 4 homeworkmarks values
    private int Exam; //this means that the integer value for the exam is only accessible for this module


    public CE003(String name, int status) { //the CE003 class is accessible to other classes and it has 2 arguments String name and int status
        super("CE003", 2); // the constructor of the super  module with the 2 parameters of CE003 and 2
        this.homeworkmarks = homeworkmarks; // this will return the homeworkmarks
        calculateFinalMark2(); // This will return calculateFinalMark2
    }
    public double[] getHomeworkMarks3() { // this is class is accessible to other classes and will allow you to store the numerical value for getHomeworkMarks3
        return homeworkmarks; // this will return the homeworkmarks
    }
    public double[] setHomeworkMarks3() {
        for (int i=0; i<4; i++){ // this makes sure that the user inputs 4 homework marks
            System.out.println ("Enter homework marks");  // it will print this message
            Scanner scanner = new Scanner(System.in); //we are using a Scanner object to read user input
            int HW = scanner.nextInt(); // the integer value marks for HW
            homeworkmarks[i] = HW; //assigning those values into the variable homeworkmarks
        }
        return homeworkmarks;} // this will return the new version of the homework marks
    public void setExam3(){ // we are creating another method and is called setExam3
        System.out.println ("Enter Exam mark"); // this will be printed to the users screen
        Scanner scanner = new Scanner(System.in); //we are using a Scanner object to read user input
        Exam = scanner.nextInt(); // we are assigning the variable Exam into the results
    }
    public double getExam3() { // this method getExam3
        return Exam; // will return Exam so,therefore the marks
    }
    public void calculateFinalMark2() { // this method is used in order to calculate final mark based on exam mark inputted and the average of the 4 homeworks
        double TOTALHM = 0; //the variable TOTALHM is set at 0 originally
        for (double homeworkmark : homeworkmarks) { // this is referring the homeworkmarks from earlier
            TOTALHM += homeworkmark; // it will add each homeworkmark
        }
        double averagehm = TOTALHM / homeworkmarks.length; // they will be divided by length of the array
        double finalmark = (0.4 * averagehm) + (0.6 * Exam); // using the formula provided to us in the coursework scenario
        setFinalMark((int) finalmark); //
        setFinalExam((int) averagehm);
    }
}
