import ru.ifmo.se.pokemon.*;
public class sandBox {
    public static void main(String[] args){
        Battle battle = new Battle();
        Heracross p1 = new Heracross("Чужой", 17);
        Sandshrew p2 = new Sandshrew("Хищник", 13);
        Sandslash p3 = new Sandslash("Ржавый", 15);
        Slaking p4 = new Slaking("Сахарок", 17);
        Slakoth p5 = new Slakoth("Ратибор",13);
        Vigoroth p6 = new Vigoroth("Дикарь", 15);
        battle.addAlly(p1);
        battle.addAlly(p3);
        battle.addAlly(p5);
        battle.addFoe(p2);
        battle.addFoe(p4);
        battle.addFoe(p6);
        battle.go();
    }
}
