package com.nullnumber1.lab4;

import java.util.Objects;

public abstract class Human {
    private String name;
    private Location location;

    public Human(String name) {
        this.name = name;
    }

    protected Human() {
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
        Lab4Application.Narrator.printLn(this.toString() + " moved to " + this.location.toString());
    }
    public Location getLocation(){
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String toSay(String phrase){
        Lab4Application.Narrator.printLn(this.toString()+" said "+phrase);
        return phrase;
    }

    public void see(String string) {
        Lab4Application.Narrator.printLn(this.toString() + " seen " + string);
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
