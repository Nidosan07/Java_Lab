package Lab_2;

class item{
    private int location;
    private String description;
    
    item(int location, String description){
        this.location = location;
        this.description = description;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    class monster{
        monster(int location, String description){
            super(location, description);

        }
    }
}


public class Lab2Ques1 {
    public static void main(String[] args) {
        
    }
}
