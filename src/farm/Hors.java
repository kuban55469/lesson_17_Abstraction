package farm;

public class Hors extends Animals{

    public Hors(int weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Hors= " + super.toString() +"\n";
    }
}
