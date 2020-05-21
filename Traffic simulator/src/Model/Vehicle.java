package Model;

import java.awt.*;
import java.util.Random;

public abstract class Vehicle {

    private static final int STOPPED = 0;
    private static final int START_POSITION = 0;
    int length; // number of segments occupied
    int breadth;
    String id; // unique identifier
    private int speed; //segments moved per turn
    private Road currentRoad; // current Model.Road object
    int position; // position on current road
    private Color colour;
    private Random random = new Random();


    public Vehicle(Road currentRoad) {
        id = "000";
        length = 4;
        breadth = 2;
        speed = 0;
        this.currentRoad = currentRoad;
        currentRoad.getVehiclesOnRoad().add(this); //add this vehicle to the road its on.
        colour = randomColour();
    }

