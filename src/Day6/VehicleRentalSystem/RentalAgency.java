package Day6.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalAgency {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> newVehicle = new ArrayList<>();
    private String make;
    private String model;
    private double rentalPrice;
    public void addVehicle(){
            System.out.print("Enter the make of the Vehicle: ");
            make = sc.nextLine();
            System.out.print("Enter the model of the Vehicle: ");
            model = sc.nextLine();
            System.out.print("Enter the rental price of " + make + " - " + model + ": ");
            make = sc.nextLine();
            newVehicle.add(make +" - " +model + " - " +rentalPrice);
    }
    public void rentVehicle(){
        for (int i = 0; i < newVehicle.size(); i++) {
            System.out.println("Vehicle index " +i +" is " +newVehicle.get(i));
        }
        while (true) {
            System.out.println("Do you want to rent a car? (yes/no)");
            String response = sc.nextLine();
            if (response.equals("no")) {
                break;
            } else if (response.equals("yes")) {
                System.out.println("Enter index of vehicle of your choice: ");
                int j = sc.nextInt();
                if (j>=0 && j<newVehicle.size()) {
                    System.out.println("You chose to rent: " +newVehicle.get(j));
                }else {
                    System.out.println("Wrong input!");
                }
            } else {
                System.out.println("Invalid response. Please enter 'yes' or 'no'.");
            }
        }
        }
    }