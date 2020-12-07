import ru.ifmo.se.pokemon.*;

public class Vigoroth extends Pokemon {
    public Vigoroth(String name, int lvl){
        super(name, lvl);
        setStats(80, 80,80,55, 55, 90);
        setType(Type.NORMAL);
        setMove(new BulkUp(), new Thunder(), new FurySwipes());
    }
}
class FurySwipes extends PhysicalMove {
    public FurySwipes(){
        super(Type.NORMAL, 18,0.8);
    }
    protected void applySelfEffects(Pokemon p){
        if (Math.random() < 0.375){
            super.power = 36;
        }
        if (Math.random() >= 0.375 && Math.random() < 0.75){
            super.power = 54;
        }
        if (Math.random() >= 0.75 && Math.random() < 0.875){
            super.power = 72;
        }
        if (Math.random() >= 0.875 && Math.random() < 1.00){
            super.power = 90;
        }
    }
    protected java.lang.String describe() { return("Uses Fury Swipes"); }
}
