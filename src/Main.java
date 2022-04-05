import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DeliveryBoy deliver1 = new DeliveryBoy();
        DeliveryBoy deliver2 = new DeliveryBoy();
        consoleforInput cfi = new consoleforInput();
        boolean check = true;

        do {
            System.out.println("Hey! Select a menu item: 1 - add new delivery, 2 - View completed deliveries, 3 - Exit" );
            int item = scn.nextInt();

            if (item == 1) {
                int deliver;
                boolean checkList = false;
                do {
                    System.out.println("Assign a courier: 1 or 2");
                    deliver = scn.nextInt();

                    if (deliver == 1) {
                        if (deliver1.shipingList[deliver1.MAX_Delivery - 1] == null ) {
                            checkList = true;
                        } else {
                            System.out.println("List is full, assign another courier");
                            checkList = false;
                        }
                    } else if (deliver == 2) {
                        if (deliver2.shipingList[deliver2.MAX_Delivery - 1] == null ) {
                            checkList = true;
                        } else {
                            System.out.println("List is full, assign another courier");
                            checkList = false;
                        }
                    }

                } while (!checkList);

                if (deliver == 1) {
                    System.out.println("Select the type: 1 - Box , 2 - Package");
                    int type = scn.nextInt();

                    if (type == 1) {
                        cfi.input();
                        deliver1.add(new Box(cfi.getName(), cfi.getStreet(), cfi.getHouseNumber(), cfi.getWeight(), cfi.isFragile(), cfi.getDeliveryTime() ));
                    } else if (type == 2) {
                        cfi.input();
                        deliver1.add(new Package(cfi.getName(), cfi.getStreet(), cfi.getHouseNumber(), cfi.getWeight(), cfi.isFragile(), cfi.getDeliveryTime() ));
                    }
                } else if (deliver == 2) {
                    System.out.println("Select the type: 1 - Box , 2 - Package");
                    int type = scn.nextInt();

                    if (type == 1) {
                        cfi.input();
                        deliver2.add(new Box(cfi.getName(), cfi.getStreet(), cfi.getHouseNumber(), cfi.getWeight(), cfi.isFragile(), cfi.getDeliveryTime() ));
                    } else if (type == 2) {
                        cfi.input();
                        deliver2.add(new Package(cfi.getName(), cfi.getStreet(), cfi.getHouseNumber(), cfi.getWeight(), cfi.isFragile(), cfi.getDeliveryTime() ));
                    }
                }

            } else if (item == 2) {
                System.out.println(deliver1);
                System.out.println(deliver2);
            } else if (item == 3) {
                check = false;
            }
        } while (check);




    }
}
