package Lab_5;

abstract class Shape{
    abstract void calculateArea();
    void display(){
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape{
    int length, width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of rectangle: " + length*width);
    }
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of circle: " + Math.PI*radius*radius);
    }
}

public class ques4 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(10, 20);
        Circle obj2 = new Circle(10);
        
        obj1.calculateArea();
        obj2.calculateArea();
    }
    
}
