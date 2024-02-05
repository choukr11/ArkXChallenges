package Day6.VehicleRentalSystem;

public class Bike extends Vehicle {
    private String make;
    private String model;
    private double rentalPrice;
    public void addVehicle() {

        System.out.print("Enter the make of the bike: ");
        make = sc.nextLine();
        System.out.print("Enter the model of the bike: ");
        model = sc.nextLine();
        System.out.print("Enter the rental price of " + make + " - " + model + ": ");
        make = sc.nextLine();
        newVehicle.add(make +" - " +model + " - " +rentalPrice);

    }
    public String getMake() {
        System.out.println("Your bike is a " + make + " - " + model + ", for it costs " + rentalPrice + " per day for rent.");
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
}
