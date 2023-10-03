public abstract class Module { //we are defining the class Module
    //There are 4 private instance variables(which are variables that have been used from a different class) in this case String type "name", int type "status", double type "finalMark", and "finalExam".
    private String name;
    private int status;
    double finalMark;


    double finalExam;


    public Module(String name, int status) { //the Module class is accessible to other classes and it has 2 arguments String name and int status
        this.name = name; // this will return name
        this.status = status; // this will return status
    }


    public void setFinalMark(int finalMark) { // we are creating another method and is called setFinalMark
        this.finalMark = finalMark; //this will return finalMark
    }


    public String getName() { //this is a getter method which will
        return this.name; //  give you name
    }


    public int getStatus() { // getter method that will
        return this.status; // give you the status
    }


    public double getFinalMark() { //another getter method
        return this.finalMark; // that will give you finalMark
    }


    public void setFinalExam(int finalExam) { // a getter method that will take an integer value of finalExam
        this.finalExam = finalExam; //this will give you finalExam
    }
    public double getFinalExam() { //another getter method
        return this.finalExam; // this will give you a finalExam
    }
}
