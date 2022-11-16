package car;

public class Tesla extends Car{
    public Tesla(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Electric car!!");
    }

    @Override
    public void brake() {
        System.out.println("American car!");
    }
}
