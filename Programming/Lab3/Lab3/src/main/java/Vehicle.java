public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String drive(Location location){
        System.out.print(name+" is making engine sound, ");
        return name+" got to "+location;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
