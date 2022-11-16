package farm;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Cow cow;
    private Hors[] hors;
    private Hors hors1;
    private Sheep[] sheep;
    private Sheep sheep1;
    private String ownerName;

    public Farm(String address, Cow[] cows, Hors[] hors, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.hors = hors;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }
    public Farm(String address, Cow cow, Hors hors1, Sheep sheep1, String ownerName) {
        this.address = address;
        this.cow = cow;
        this.hors1 = hors1;
        this.sheep1 = sheep1;
        this.ownerName = ownerName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Hors[] getHors() {
        return hors;
    }

    public void setHors(Hors[] hors) {
        this.hors = hors;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Hors getHors1() {
        return hors1;
    }

    public void setHors1(Hors hors1) {
        this.hors1 = hors1;
    }

    public Sheep getSheep1() {
        return sheep1;
    }

    public void setSheep1(Sheep sheep1) {
        this.sheep1 = sheep1;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", hors=" + Arrays.toString(hors) +
                ", sheep=" + Arrays.toString(sheep) +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

}
