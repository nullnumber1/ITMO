public class MainSequence {
    public static void main(String[] args){
        CuttersGroup shorties = new CuttersGroup ("Коротышки");
        Dunno dunno = Dunno.getInstance("Незнайка");
        Driver driver = new Driver("Шофёр");
        Vehicle truck = new Vehicle("Грузовик", driver);
        dunno.see(truck.drive(Location.SILKHEAP));
        shorties.stopCut();
        shorties.silkLoad(truck);
        driver.see(dunno.toString());
        dunno.spineShivers(driver.waveHand(dunno));
        dunno.toStressOut(dunno.toRemember("talks about things",shorties,Location.FOOLISLAND));
        dunno.changeLocation(Location.BACK);
        System.out.println(dunno.hashCode());
    }
}
