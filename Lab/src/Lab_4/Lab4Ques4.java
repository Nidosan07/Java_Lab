package Lab_4;

class Animal{}
class Mammal extends Animal{}
class Reptile extends Animal{}


public class Lab4Ques4 extends Mammal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Lab4Ques4 d = new Lab4Ques4();
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
    
}
