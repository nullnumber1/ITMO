public class Dunno extends Person implements IDunno{
    public Dunno(String name) {
        super(name);
    }

    @Override
    public void spineShivers(String action) {
        System.out.println(super.toString()+" got shivers from "+action);
    }

    @Override
    public String toRemember(String event, Object object, Location location) {
        System.out.println(super.toString()+" remembered "+event+" "+toHappenWith(object)+" on the "+location.toString());
        return super.toString()+" remembered "+event+" "+toHappenWith(object)+" on the "+location.toString();
    }

    @Override
    public void toStressOut(String event) {
        System.out.println(super.toString()+" stressed out from "+event);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
