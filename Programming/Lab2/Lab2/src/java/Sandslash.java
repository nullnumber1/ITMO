import ru.ifmo.se.pokemon.*;

public class Sandslash extends Pokemon {
    public Sandslash(String name, int lvl){
        super(name, lvl);
        setStats(75, 100,110,45, 55, 65);
        setType(Type.GROUND);
        setMove(new Bulldoze(), new Confide(), new AerialAce(), new FocusBlast());
    }
}
class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120,0.7);
    }
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    protected java.lang.String describe() { return("Uses Focus Blast"); }
}
