import java.util.Objects;

public abstract class Human {
    private String name;
    private Location location;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String toHappenWith(Object object) {
        return "happened to " + object.toString();
    }

    public void changeLocation(Location location) {
        this.location = location;
        System.out.println(this.toString() + " moved to " + this.location.toString());
    }

    public void see(String string) {
        System.out.println(this.toString() + " seen " + string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return location == human.location &&
                Objects.equals(name, human.name);
    }
}
