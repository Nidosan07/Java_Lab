package Lab_5;
interface MyFirstInterface {
    int x=0; // This is equivalent to public static final int x = 0;
    abstract void display();
}

class InterfaceImplemented implements MyFirstInterface {
    @Override
    public void display() {
    // This will not compile because x is final
    // x = 10;
    System.out.println("The value of x is: " + x);
    }
}


public class Lab5Ques1{
    public static void main(String[] args) {
        InterfaceImplemented e1 = new InterfaceImplemented();
        e1.display();
    
    }
    
}
