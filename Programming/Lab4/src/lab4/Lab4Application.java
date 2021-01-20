package com.nullnumber1.lab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Lab4Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab4Application.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Dunno dunno = context.getBean("Dunno", Dunno.class);
        Shortie shortie = new Shortie();
        Shortie.Goat goat = shortie.new Goat() {
            @Override
            public String toSay(String phrase) {
                return Narrator.returnable("mmmm...");
            }
        };
        CuttersGroup shorties = context.getBean("CuttersGroup", CuttersGroup.class);
        Vehicle truck = context.getBean("Vehicle", Vehicle.class);
        dunno.see(truck.drive(Location.SILKHEAP));
        shorties.stopCut();
        shorties.silkLoad(truck);
        truck.getDriver().see(dunno.toString());
        dunno.spineShivers(truck.getDriver().waveHand(dunno));
        dunno.toStressOut(dunno.toRemember("talks about things",shorties,Location.FOOLISLAND));
        dunno.changeLocation(Location.BACK);
        dunno.changeLocation(Location.CAROUSEL);
        goat.spin();
        shorties.spin();
        dunno.shout("Wait, brothers!");
        try {
            dunno.grab(goat);
        } catch (DizzyException e) {
            System.err.println(e.getMessage());
        }
        goat.seatGrab();
        dunno.drag(goat, Location.SOMEWHERE);
        context.close();
    }
    static class Narrator{
        Human mainPerson;
        public Narrator(Human mainPerson){
            this.mainPerson = mainPerson;
        }
        static void printLn (String event){
            System.out.println(event);
        }
        static String returnable (String event){
            return event;
        }
    }
}
