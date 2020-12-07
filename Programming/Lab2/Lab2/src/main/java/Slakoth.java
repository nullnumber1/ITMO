import ru.ifmo.se.pokemon.*;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int lvl){
        super(name, lvl);
        setStats(60, 60,60,35, 35, 30);
        setType(Type.NORMAL);
        setMove(new BulkUp(), new Thunder());
    }
}
class BulkUp extends PhysicalMove {
    public BulkUp(){
        super(Type.FIGHTING, 0,0.0);
    }
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, +1);
        p.setMod(Stat.ATTACK, +1);
    }
    protected java.lang.String describe() { return("Uses Bulk Up"); }
}
class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110,0.7);
    }
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.3) {
            Effect.paralyze(p);
        }
    }
    protected java.lang.String describe() { return("Uses Thunder"); }
}