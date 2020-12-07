import ru.ifmo.se.pokemon.*;

public class Slaking extends Pokemon {
    public Slaking(String name, int lvl){
        super(name, lvl);
        setStats(150, 160,100,95, 65, 100);
        setType(Type.NORMAL);
        setMove(new BulkUp(), new Thunder(), new FurySwipes(), new ShadowBall());
    }
}
class ShadowBall extends SpecialMove{
    public ShadowBall(){
        super(Type.GHOST, 80, 1.0);
    }
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.3){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    protected java.lang.String describe() { return("Uses Shadow Ball"); }
}
