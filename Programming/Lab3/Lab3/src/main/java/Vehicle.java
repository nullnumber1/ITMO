public class Vehicle {
    private String name;
    private Driver driver;
    public Vehicle(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public String drive(Location location){
        System.out.print(name+" is making engine sound, ");
        return name+" got to "+location;
    }

    @Override
    public String toString() {
        return (this.name + " " + this.driver.toString());
    }
}
