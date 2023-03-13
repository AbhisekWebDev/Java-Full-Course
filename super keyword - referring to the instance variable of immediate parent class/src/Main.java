class vehicle {
    int maxSpeed = 200;
}

//creating subclass
class bugatti extends vehicle {
    int maxSpeed = 450;

    void show() {
        //printing maxSpeed of base class "vehicle"
        System.out.println("Max Speed = " + super.maxSpeed);
    }
}

public class Main {
    public static void main(String[] args) {
        bugatti b = new bugatti();
        b.show();
    }
}