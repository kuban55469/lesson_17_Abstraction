package farm;

public class Sheep extends Animals{
    public Sheep(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Sheep= " + super.toString() +"\n";
    }
}
