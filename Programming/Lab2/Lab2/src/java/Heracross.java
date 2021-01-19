import ru.ifmo.se.pokemon.*;
public class Heracross extends Pokemon {
    public Heracross(String name, int lvl){
        super(name, lvl);
        setStats(80, 125,75,40, 95, 85);
        setType(Type.BUG,Type.FIGHTING);
        setMove(new BulletSeed(), new RockSlide(), new PinMissile(), new RockTomb());
    }
}
class BulletSeed extends PhysicalMove{
    public BulletSeed(){
        super(Type.GRASS, 25, 1.00);
    }
    protected void applySelfEffects(Pokemon p){
        if (Math.random() < 0.375){
            p.setStats(50, 125,75,40, 95, 85);
        }
        if (Math.random() >= 0.375 && Math.random() < 0.75){
            p.setStats(75, 125,75,40, 95, 85);
        }
        if (Math.random() >= 0.75 && Math.random() < 0.875){
            p.setStats(100, 125,75,40, 95, 85);
        }
        if (Math.random() >= 0.875 && Math.random() < 1.00){
            p.setStats(125, 125,75,40, 95, 85);
        }
    }
    protected java.lang.String describe() { return("Uses Bullet Seed"); }
}
class RockSlide extends PhysicalMove{
    public RockSlide(){
        super(Type.ROCK, 75, 0.9);
    }
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.flinch(p);
        }
    }
    protected java.lang.String describe() { return("Uses Rock Slide"); }
}
class PinMissile extends PhysicalMove{
    public PinMissile(){
        super(Type.BUG,25, 0.95);
    }
    protected void applySelfEffects(Pokemon p){
        if (Math.random() < 0.375){
            super.power = 50;
        }
        if (Math.random() >= 0.375 && Math.random() < 0.75){
            super.power = 75;
        }
        if (Math.random() >= 0.75 && Math.random() < 0.875){
            super.power = 100;
        }
        if (Math.random() >= 0.875 && Math.random() < 1.00){
            super.power = 125;
        }
    }
    protected java.lang.String describe() { return("Uses Pin Missile"); }
}
class RockTomb extends PhysicalMove{
    public RockTomb(){
        super(Type.ROCK, 60,0.95);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED,-1);
    }
    protected java.lang.String describe() { return("Uses Rock Tomb"); }
}
