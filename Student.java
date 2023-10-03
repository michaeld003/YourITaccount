import java.util.Arrays; // we are importing the arrays class


public class Student { // the student class is defined
    //private instance variables(which are variables that have been used from a different class)
    private String FIRSTNAME;
    private String SURNAME;


    public Student(String FIRSTNAME, String SURNAME) {// the Student class is accessible to other classes and it has 2 arguments String FIRSTNAME and String SURNAME
        this.FIRSTNAME = FIRSTNAME; // this will give you FIRSTNAME
        this.SURNAME = SURNAME; // this will give you SURNAME
    }




    public String getFIRSTNAME() { // we are defining a method for the getFIRSTNAME
        return FIRSTNAME; //this will give you FIRSTNAME
    }


    public void setFIRSTNAME(String FIRSTNAME) { // this will create another method  setFIRSTNAME
        this.FIRSTNAME = FIRSTNAME; //this will give you FIRSTNAME
    }


    public String getSURNAME() {
        return SURNAME; //this will give you SURNAME
    }


    public void setSURNAME(String SURNAME) { // this will create another method  setSURNAME
        this.SURNAME = SURNAME;//this will give you SURNAME
    }
}

