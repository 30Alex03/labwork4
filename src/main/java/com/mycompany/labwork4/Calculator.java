package com.mycompany.labwork4;

import java.util.ArrayList;

public class Calculator {

    public void calculateFuelLoad(ArrayList<Reactor> reactors) {

        for (Reactor reactor : reactors) {
            int year = 2014;
            while (year < 2025) {
                double fuelLoad = 0;
                if (reactor.getLoadFactor().containsKey(year)) {
                    fuelLoad = reactor.getThermalCapacity() * reactor.getLoadFactor().get(year) / 100 / reactor.getType().getBurnup();
                } else if (reactor.getShutdownYear() >= year & reactor.getConnectionYear() <= year) {
                    fuelLoad = reactor.getThermalCapacity() * 85 / 100 / reactor.getType().getBurnup();
                }
                reactor.getFuelLoad().put(year, fuelLoad);
                year++;
            }
        }
    }
}
