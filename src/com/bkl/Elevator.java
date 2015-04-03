package com.bkl;

import java.util.List;

/**
 * Created by lake on 4/3/15.
 */
public class Elevator {
    private int numberOfFloors = 1;
    private int tripCounter = 0;
    private int floorsPassedCounter = 0;
    private int currentFloor = 1;
    private Boolean currentDirection = null;
    private List<Integer> destinations;
    private boolean active = true;
    private int elevatorId;

    public Elevator(int elevatorId, int numOfFloors){
        this.elevatorId = elevatorId;
        this.numberOfFloors = numOfFloors;
    }
}
