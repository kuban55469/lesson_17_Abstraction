package car;

public class Nissan extends Car{


    public Nissan(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Benzine car!!");
    }

    @Override
    public void brake() {
        System.out.println("Japan car!!");
    }
}
