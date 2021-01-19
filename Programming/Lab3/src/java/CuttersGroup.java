public class CuttersGroup extends Shortie implements Cutter {
    public CuttersGroup(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Cut() {
        System.out.println(super.toString() + " are cutting");
    }

    @Override
    public void stopCut() {
        System.out.println(super.toString() + " are stopped cutting");
    }

    @Override
    public void silkLoad(Vehicle vehicle) {
        System.out.println(super.toString() + " are loading silk to the cabin of " + vehicle.toString());
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
