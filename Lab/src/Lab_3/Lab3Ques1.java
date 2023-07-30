package Lab_3;
// Exercise 3-1: Develop a code for the following scenario. 
// “An encapsulated class contains three variables to store Name, Age and Salary of the employee. Evelop getters and setters to set and get values . Develop a test class to test your code.”
// Now modify the same code by  trying to replace the setters using  a constructor. 

// Exercise 3-2: Code for the last example that we have discussed during the class. We need the following Output. (Use Netbeans code generation option where necessary)
// Employee Name: xxxxx (Use setter to set and getter to retrieve)
// Basic Salary: xxxx (Use setter to set and getter to retrieve)
// Bonus: xxxx (You may use the constructor to pass this value)
// Bonus Amount: xxxxx (Develop a separate method to calculate Bonus amount. Bonus amount is the total of Bonus and Basic Salary)
// E.g. 
// Employee Name: Bogdan
// Basic Salary: 50000 
// Bonus: 10000 
// Bonus Amount: 60000 


class EmployeeDetails{
    private String name;
    private double Bonus;
    private double salary;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBonus(int Bonus){
        this.Bonus = Bonus;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public double getBonus(){
        return Bonus;
    }
    
    public double getSalary(){
        return salary;
    }


}


public class Lab3Ques1 {
    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails();
        e1.setName("shan");
        e1.setSalary(50000);
        e1.setBonus(10000);
        System.out.println("Employee Name: "+e1.getName());
        System.out.println("Basic Salary: "+e1.getSalary());
        System.out.println("Bonus: "+e1.getBonus());
        System.out.println("Bonus Amount: "+(e1.getBonus() + e1.getSalary()));

    }
}
