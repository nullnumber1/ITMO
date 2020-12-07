import ru.ifmo.se.pokemon.*;

public class Sandshrew extends Pokemon {
    public Sandshrew(String name, int lvl){
        super(name, lvl);
        setStats(50, 75,85,20, 30, 40);
        setType(Type.GROUND);
        setMove(new Bulldoze(), new Confide(), new AerialAce());
    }
}
class Bulldoze extends PhysicalMove{
    public Bulldoze(){
        super(Type.GROUND, 60, 1.00);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED, -1);
    }
    protected java.lang.String describe() { return("Uses Bulldoze"); }
}
class Confide extends PhysicalMove{
    public Confide(){
        super(Type.NORMAL,0.1,0.1);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }
    protected java.lang.String describe() { return("Uses Confide"); }
}
class AerialAce extends PhysicalMove{
    public AerialAce(){
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }
    protected void applySelfEffects(Pokemon p){
    }
    protected java.lang.String describe() { return("Uses Aerial Ace"); }
}