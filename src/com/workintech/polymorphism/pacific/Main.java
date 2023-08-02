package com.workintech.polymorphism.pacific;

public class Main {
    public static void main(String[] args) {

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

//        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "A gas-powered car", 10.5, 4);
//        CarSkeleton electricCar = new ElectricCar("Electric Car", "An electric car", 250, 75);
//        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "A hybrid car", 15.0, 60, 2);
//
//        testCar(gasCar);
//        testCar(electricCar);
//        testCar(hybridCar);
    }


    }

