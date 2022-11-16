package farm;

import farm.Animals;

public class Cow extends Animals {

    public Cow(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Cow= " + super.toString() + "\n";
    }
}
