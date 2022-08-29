package org.example;

import java.util.Arrays;
import java.util.List;

public class SedanProductionLine implements ProductionLine{
    public void Work(List<CarObject> cars) {
        cars.add(new CarSedan());
        //System.out.println("Sedan built");
    }
}
