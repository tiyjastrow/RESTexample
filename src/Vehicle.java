/**
 * Created by johnjastrow on 4/20/16.
 */
public class Vehicle {
    String make;
    String name;
    String fuel;
    String color;

    public Vehicle(String make, String name, String fuel, String color) {
        this.make = make;
        this.name = name;
        this.fuel = fuel;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
