package Lab_5;

final class Student{
    final int marks = 100;
    final void display();
}

class Undergraduate extends Student{
    @Override
    void display(){
        System.out.println("Marks: " + marks);
    }
}
public class ques3 {
    public static void main(String[] args) {
        
    }
    
}
