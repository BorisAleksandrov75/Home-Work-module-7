import java.util.Scanner;

public class consoleforInput {

    Scanner scn = new Scanner(System.in);
    private String name;
    private String street;
    private int houseNumber;
    private int weight;
    private boolean fragile;
    private int deliveryTime;

    public void input() {
        System.out.print("Input name - ");
        name = scn.next();
        System.out.print("Input street - ");
        street = scn.next();
        System.out.print("Input House number - ");
        houseNumber = scn.nextInt();
        System.out.print("Input weight - ");
        weight = scn.nextInt();
        System.out.print("Input true or false if Parceel fragile  - ");
        fragile = scn.nextBoolean();
        System.out.print("Input delivery time - ");
        deliveryTime = scn.nextInt();
    }

    public Scanner getScn() {
        return scn;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isFragile() {
        return fragile;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
}
