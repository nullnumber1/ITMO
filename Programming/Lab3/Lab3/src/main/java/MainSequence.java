public class MainSequence {
    public static void main(String[] args){
        CuttersGroup shorties = new CuttersGroup ("Коротышки");
        Dunno dunno = new Dunno("Незнайка");
        Vehicle truck = new Vehicle("Грузовик");
        dunno.see(truck.drive(Location.SILKHEAP));
        shorties.stopCut();
        shorties.silkLoad(truck);
        Driver driver = new Driver("Шофёр");
        driver.see(dunno.toString());
        dunno.spineShivers(driver.waveHand(dunno));
        dunno.toStressOut(dunno.toRemember("talks about things",shorties,Location.FOOLISLAND));
        dunno.changeLocation(Location.BACK);
    }
}
