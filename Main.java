import java.util.Arrays; // we are importing the arrays class
import java.util.Scanner; // we are importing the scanner module class so the user can input their data
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Get a number of students taking the module (entered by the user)
        System.out.print("Number of students "); //it will print this message
        int numberofstudentsobject = scanner.nextInt();



        System.out.println("Number of students in module: " + numberofstudentsobject);// this will give you how many students in module


        // This will make an empty array of students to store the relevant information for all studentsobject entered above
        Student[] studentsobject = new Student[numberofstudentsobject];
        CW001[] cw001 = new CW001[numberofstudentsobject];
        EX002[] ex002 = new EX002[numberofstudentsobject];
        CE003[] ce003 = new CE003[numberofstudentsobject];


        for (int i = 0; i < numberofstudentsobject; i++) { // this makes sure that the user inputs the info needed ,but it has to be according to the number of students inputted by the user
            System.out.println("Enter the information of student " + (i + 1) + ":"); //this will be printed on the screen
            System.out.print("First Name: ");
            String FIRSTNAME = scanner.next(); // the user will input their first name
            System.out.print("SURNAME: "); // the user will input their SURNAME
            String SURNAME = scanner.next();
            System.out.print("ID: "); // the user will input their ID
            String ID = scanner.next();


            // This will create objects for studentsobject
            var std = new Student(FIRSTNAME, SURNAME);
            studentsobject[i] = std;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter status (0,1,2)");
                int status = scanner.nextInt();
                switch (status) {
                    case 0:
                        cw001[i] = new CW001("CW001", 0);
                        cw001[i].setHomeworkMarks1();
                        cw001[i].setProjectMark();
                        cw001[i].calculateFinalMark1();
                        break;
                    case 1:
                        ex002[i] = new EX002("EX002", 1);
                        ex002[i].setExam2();
                        break;
                    case 2:
                        ce003[i] = new CE003("CE003", 2);
                        ce003[i].setHomeworkMarks3();
                        ce003[i].setExam3();
                        ce003[i].calculateFinalMark2();
                        break;
                    default:
                        System.out.println("Invalid status");
                }
            }
        }
        System.out.println("• Marks for all modules: ");
        System.out.printf("%20s%15s%15s%15s%15s", "Name", "SURNAME", "CW001", "EX002", "CE003"); // Print a table top row
        System.out.println();
        // Loop through object in each module and prints output
        for (int a = 0; a < numberofstudentsobject; a++) {
            //This will Print the student's information and grades
            Student st = studentsobject[a];
            CW001 cw = cw001[a];
            EX002 ex = ex002[a];
            CE003 ce = ce003[a];
            System.out.printf("%20s%15s%15s%15s%15s", st.getFIRSTNAME(), st.getSURNAME(), cw.getFinalMark()+"%", ex.getFinalMark()+"%", ce.getFinalMark()+"%");
            System.out.println();
        }
        System.out.println("..........................................................................................................");
        System.out.println("• Marks for CW001: ");
        System.out.printf("%20s%15s%15s%15s%15s", "Name", "SURNAME", "HWs", "Project", "Final Mark"); // Print a table top row
        System.out.println();
        // Loop through object in each module and prints output
        for (int a = 0; a < numberofstudentsobject; a++) {
            //This will print the student's information and grades
            Student st = studentsobject[a];
            CW001 cw = cw001[a];
            EX002 ex = ex002[a];
            CE003 ce = ce003[a];
            System.out.printf("%20s%15s%15s%15s%15s", st.getFIRSTNAME(), st.getSURNAME(), cw.getFinalExam()+"%", cw.getProjectMark()+"%", cw.getFinalMark()+"%");
            System.out.println();
        }
        System.out.println("..........................................................................................................");
        System.out.println("• Marks for EX002: ");
        System.out.printf("%20s%15s%15s", "Name", "SURNAME", "Final Mark"); // Print a table top row
        System.out.println();
        // for Loop through object in each module and prints output
        for (int a = 0; a < numberofstudentsobject; a++) {
            //Print the student's information and grades
            Student st = studentsobject[a];
            CW001 cw = cw001[a];
            EX002 ex = ex002[a];
            CE003 ce = ce003[a];
            System.out.printf("%20s%15s%15s", st.getFIRSTNAME(), st.getSURNAME(), ex.getFinalMark()+"%");
            System.out.println();
        }
        System.out.println("..........................................................................................................");
        System.out.println("• Marks for CE003: ");
        System.out.printf("%20s%15s%15s%15s%15s", "Name", "SURNAME", "CW", "Exam", "Final Mark"); // Print a table top row
        System.out.println();
        // for Loops through object in each module and will print out the following  output
        for (int a = 0; a < numberofstudentsobject; a++) {
            //This is in order to print of the student's information and grades
            Student st = studentsobject[a];
            CW001 cw = cw001[a];
            EX002 ex = ex002[a];
            CE003 ce = ce003[a];
            System.out.printf("%20s%15s%15s%15s%15s", st.getFIRSTNAME(), st.getSURNAME(), ce.getFinalExam()+"%", ce.getExam3()+"%", ce.getFinalMark()+"%");
            System.out.println();
        }




    }
}
