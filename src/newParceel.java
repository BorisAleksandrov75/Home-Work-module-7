
abstract class newParceel {
    
    protected String name;
    protected String street;
    protected int houseNumber;
    protected int weight;
    protected boolean fragile;
    protected int deliveryTime;

    public newParceel(String name, String street, int houseNumber, int weight, boolean fragile, int deliveryTime) {
        this.name = name;
        this.street = street;
        this.houseNumber = houseNumber;
        this.weight = weight;
        this.fragile = fragile;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "newParceel{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", weight=" + weight +
                ", fragile=" + fragile +
                ", deliveryTime=" + deliveryTime +
                '}';
    }
}
