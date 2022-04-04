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
                int deliver;
                boolean checkList;
                do {
                    System.out.println("Assign a courier: 1 or 2");
                    deliver = scn.nextInt();

                    if (deliver1.shipingList[deliver1.MAX_Delivery - 1] == null) {
                        checkList = true;
                    } else {
                        System.out.println("List is full, assign another courier");
                        checkList = false;
                    }

                } while (!checkList);



                if (deliver == 1) {
                    System.out.println("Select the type: 1 - Box , 2 - Package");
                    int type = scn.nextInt();

                    if (type == 1) {
                       if (deliver1.shipingList[deliver1.count + 1] == null) {
                           cfi.input();
                           deliver1.add(new Box(cfi.getName(), cfi.getStreet(), cfi.getHouseNumber(), cfi.getWeight(), cfi.isFragile(), cfi.getDeliveryTime()));
                       } else {
                           boolean checkTime;
                           cfi.input();
                           for (int i = 0; i < deliver1.MAX_Delivery - 2; i++) {
                               if (deliver1.shipingList[i].deliveryTime == deliver1.shipingList[i + 1].deliveryTime) {
                                   System.out.println("");
                               }
                           }
                       }

                    }

                }
            } else if (item == 2) {
                System.out.println(deliver1.toString());
            }
        } while (true);




    }
}
