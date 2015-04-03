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
    private ElevatorController myController;

    public Elevator(ElevatorController parent, int elevatorId, int numOfFloors){
        this.myController = parent;
        this.elevatorId = elevatorId;
        this.numberOfFloors = numOfFloors;
    }

    public void makeTrip(int requestedFloor){
        //TODO: need to plan to handle going to multiple destinations on trip

        destinations.add(requestedFloor);
    }

    private void goDirectToFloor(int floor){
        //Safe guard against going to invalid floor
        if(floor > 0 && floor <= numberOfFloors) {
            //close doors before moving
            myController.closedDoors(elevatorId, currentFloor);

            if (floor > currentFloor) {
                //Positive for UP
                currentDirection = true;
                for (int i = currentFloor; i <= floor; i++) {
                    floorsPassedCounter++;
                    currentFloor++;
                    myController.reportMovement(elevatorId, currentFloor);
                }
            } else if (floor < currentFloor) {
                //Negative for DOWN
                currentDirection = false;
                for (int i = currentFloor; i >= floor; i--) {
                    floorsPassedCounter++;
                    currentFloor--;
                    myController.reportMovement(elevatorId, currentFloor);
                }

            } else {
                //Null for stopped
                currentDirection = null;
            }

            //Open doors at destination
            myController.openedDoors(elevatorId, currentFloor);
        }
    }

    public void getDistanceFromFloor(int floor){
        //calculate distance taking into account the existing destinations
    }

}
