import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DeliveryBoy deliver1 = new DeliveryBoy();
        DeliveryBoy deliver2 = new DeliveryBoy();
        consoleforInput cfi = new consoleforInput();
        boolean check = false;

        do {
            System.out.println("Hey! Select a menu item: 1 - add new delivery, 2 - View completed deliveries, 3 - Exit" );
            int item = scn.nextInt();

            if (item == 1) {
                System.out.println("Assign a courier: 1 or 2");
                int deliver = scn.nextInt();

                if (deliver == 1) {
                    System.out.println("Select the type: 1 - Box , 2 - Package");
                    int type = scn.nextInt();

                    if (type == 1) {
                        do {
                            cfi.input();
                            deliver1.add(new Box(cfi.getName(), cfi.getStreet(), cfi.getHouseNumber(), cfi.getWeight(), cfi.isFragile(), cfi.getDeliveryTime()));

                        }

                    }


                }
            }
        }

















    }
}
