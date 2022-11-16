package car;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Nissan("GTR","Blue",240);
        System.out.println(nissan);
        nissan.gas();
        nissan.brake();

        System.out.println();

        Car tesla = new Tesla("Model X","Black",280);
        System.out.println(tesla);
        tesla.gas();
        tesla.brake();
    }
}
