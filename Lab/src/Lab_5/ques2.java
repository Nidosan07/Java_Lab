package Lab_5;

interface speaker {
    abstract void speak();
}

class Politician implements speaker {
    @Override
    public void speak() {
        System.out.println("I am a politician");
    }
}

class Priest implements speaker {
    @Override
    public void speak() {
        System.out.println("I am a priest");
    }
}

class Lecturer implements speaker {
    @Override
    public void speak() {
        System.out.println("I am a lecturer");
    }
}

public class ques2 {
    public static void main(String[] args) {
        speaker obj1 = new Politician();
        speaker obj2 = new Priest();
        speaker obj3 = new Lecturer();

        obj1.speak();
        obj2.speak();
        obj3.speak();
    }

}
