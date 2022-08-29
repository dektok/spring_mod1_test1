package org.example;

import java.util.List;

public class BusProductionLine implements ProductionLine {
    public void Work(List<CarObject> cars) {

        cars.add(new CarBus());
        //System.out.println("Bus built");
    }
}
