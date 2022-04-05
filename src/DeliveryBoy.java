import java.util.Arrays;

public class DeliveryBoy {

    final int MAX_Delivery = 1;
    private static int a = 0;
    newParceel[] shipingList = new newParceel[MAX_Delivery];

    public void add(newParceel parceel) {
       if (a < MAX_Delivery) {
           shipingList[a++] = parceel;
       } else {
           System.out.println("This all , list is full");
       }
    }



    @Override
    public String toString() {
        return "DeliveryBoy{" +
                "shipingList=" + Arrays.toString(shipingList) +
                '}';
    }

}
