package com.nullnumber1.lab4;

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
        Lab4Application.Narrator.printLn(this.toString()+" remembered "+event+" "+toHappenWith(object)+" on the "+location.toString());
        return this.toString()+" remembered "+event+" "+toHappenWith(object)+" on the "+location.toString();
    }

    @Override
    public void toStressOut(String event) {
        System.out.println(this.toString()+" stressed out from "+event);
    }

    @Override
    public void shout(String speech) {
        System.out.print(speech);
        Lab4Application.Narrator.printLn(" shouted "+this);
    }

    @Override
    public void grab(Shortie shortie) throws DizzyException {
        Lab4Application.Narrator.printLn(this.toString()+" grabbed "+shortie.toString()+" from "+shortie.getLocation());
        if (shortie.isDizzy()){
            throw new DizzyException(shortie.toString()+" is Dizzy!");
        }
    }
    public void drag(Shortie shortie, Location location) throws MoveException {
        if (shortie.isDizzy()){
            Lab4Application.Narrator.printLn(this.toString()+" tried to drag "+shortie.toString());
            throw new MoveException(shortie.toString()+" is Dizzy and saying "+((Shortie.Goat)shortie).toSay("whatever he is trying to say"));
        }
        else{
            Lab4Application.Narrator.printLn(this.toString()+" dragged "+shortie.toString()+" to "+location.toString());
        }

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
