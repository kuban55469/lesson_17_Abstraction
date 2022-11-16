package car;

public abstract class Car {
    private String model;
    private String Colour;
    private   int maxSpeed;


    public Car(String model, String colour, int maxSpeed) {
        this.model = model;
        Colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void gas();
    public abstract void brake();

    @Override
    public String toString() {
        return "Car =  " +
                " Model: " + model  +
                ", Colour: " + Colour +
                ", Max Speed: " + maxSpeed;
    }
}
