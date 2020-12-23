public final class Dunno extends Shortie implements IsDunno{
    private static Dunno instance;
    private String name;
    private Dunno (String name){
        this.name = name;
    }
    public static Dunno getInstance(String name){
        if(instance == null){
            instance = new Dunno(name);
        }
        return instance;
    }
    @Override
    public void spineShivers(String action) {
        System.out.println(this.toString()+" got shivers from "+action);
    }

    @Override
    public String toRemember(String event, Object object, Location location) {
        System.out.println(this.toString()+" remembered "+event+" "+toHappenWith(object)+" on the "+location.toString());
        return this.toString()+" remembered "+event+" "+toHappenWith(object)+" on the "+location.toString();
    }

    @Override
    public void toStressOut(String event) {
        System.out.println(this.toString()+" stressed out from "+event);
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
        return this.name;
    }
}
