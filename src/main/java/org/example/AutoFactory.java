package org.example;

import java.util.List;

public class AutoFactory {
    private int productionSize;
    private ProductionLine productionLine;

    public AutoFactory(int productionSize, ProductionLine productionLine) {
        this.productionLine = productionLine;
        this.productionSize = productionSize;
    }

    public void runProduction(List<CarObject> cars){
        int carsBuilt = 0;

        while (carsBuilt < productionSize) {
            productionLine.Work(cars);
            carsBuilt++;
        }
    }
}
