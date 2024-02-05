package Day6.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> newVehicle = new ArrayList<>();
    private String make;
    private String model;
    private double rentalPrice;

    public void addVehicle() {

        System.out.print("Enter the make of the Vehicle: ");
        make = sc.nextLine();
        System.out.print("Enter the model of the Vehicle: ");
        model = sc.nextLine();
        System.out.print("Enter the rental price of " + make + " - " + model + ": ");
        make = sc.nextLine();
        newVehicle.add(make +" - " +model + " - " +rentalPrice);

    }

    public String getMake() {
        System.out.println("Your vehicle is a " + make + " - " + model + ", for it costs " + rentalPrice + " per day for rent.");
        return make;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public double getRentalPrice() {
        System.out.println(rentalPrice);
        return rentalPrice;
    }

    public void listVehicle() {
        String model = sc.nextLine();
        switch (model) {
            case "Make1":
            case "Make2":
            case "Make3":
                System.out.println("This model " + model + ", costs $" + rentalPrice + "/day.");
                break;

            default:
                System.out.println("we don't have " + make + " for rent.");


        }
    }

    class Car extends Vehicle {

        @Override
        public void listVehicle() {
            make = sc.nextLine();
            switch (make) {
                case "Mercedes":
                    System.out.println("You chose a Mercedes, model " + model + ", for rent, it costs $" + rentalPrice + "/day.");
                    break;
                case "Toyota":
                    System.out.println("You chose a Toyota, model " + model + ", for rent, it costs $" + rentalPrice + "/day.");
                    break;
                case "Dacia":
                    System.out.println("You chose a Dacia, model " + model + ", for rent, it costs $" + rentalPrice + "/day.");
                    break;
                default:
                    System.out.println("we don't have " + make + " for rent.");

            }


        }

        class Bike extends Vehicle {
            @Override
            public void listVehicle() {
                make = sc.nextLine();
                switch (make) {
                    case "VTT":
                        System.out.println("You chose a VTT, model " + model + ", for rent, it costs $" + rentalPrice + "/day.");
                        break;
                    case "BMX":
                        System.out.println("You chose a BMX, model " + model + ", for rent, it costs $" + rentalPrice + "/day.");
                        break;
                    case "Electric 001":
                        System.out.println("You chose a Electric 001, model " + model + ", for rent, it costs $" + rentalPrice + "/day.");
                        break;
                    default:
                        System.out.println("we don't have " + make + " for rent.");

                }
            }

        }
    }
}