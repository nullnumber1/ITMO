public class Driver extends Person {
    public Driver(String name) {
        super(name);
    }

    public String waveHand(Person person) {
        System.out.println(super.toString() + " waved his hand to " + person.toString());
        return super.toString() + " waved his hand to " + person.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
