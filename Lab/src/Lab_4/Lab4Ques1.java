package Lab_4;

// Create a class called “Employee” which has 3 private variables (empID, empName, empDesignation) and create getters and setters for each field. Please note that this has no main method since this is just  a blueprint  not a application. Now crate a test class to invoke the Employee class. Create two objects  for Mr.Bogdan and Ms.Bird and set required values using setters  and print them back on the console using getters.

class Employee{
    private int empID;
    private String empName;
    private String empDesignation;
    
    public void setEmpID(int empID){
        this.empID = empID;
    }
    
    public void setEmpName(String empName){
        this.empName = empName;
    }
    
    public void setEmpDesignation(String empDesignation){
        this.empDesignation = empDesignation;
    }
    
    public int getEmpID(){
        return empID;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public String getEmpDesignation(){
        return empDesignation;
    }
    
}
public class Lab4Ques1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpID = 100;
        e1.setEmpName = "Shan";
        e1.setEmpDesignation = "Software Engineer";
        System.out.println("Employee ID: "+e1.getEmpID());
        System.out.println("Employee Name: "+e1.getEmpName());
        System.out.println("Employee Designation: "+e1.getEmpDesignation());

    }
    
}
