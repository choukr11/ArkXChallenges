package Day6.VehicleRentalSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Vehicle car = new Vehicle();

        while (true) {
            System.out.println("Do you want to add a car to the fleet? (yes/no)");
            String response = sc.nextLine();

            if (response.equals("no")) {
                break;
            } else if (response.equals("yes")) {
                car.addVehicle();
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }

        RentalAgency rent = new RentalAgency();
        rent.rentVehicle();


    }
}