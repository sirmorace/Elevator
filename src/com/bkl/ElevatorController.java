package com.bkl;

import java.util.HashMap;

/**
 * Created by lake on 4/3/15.
 */
public class ElevatorController {
    private HashMap<Integer, Elevator> elevatorMap = new HashMap<Integer, Elevator>();

    public ElevatorController(int numberOfElevators, int numberOfFloors){
        for(int i=1;i<=numberOfElevators;i++){
            elevatorMap.put(i, new Elevator(this, i, numberOfFloors));
        }
    }

    public void requestElevator(int floorRequesting){
        //determine which elevator to give the request to: (priority) Elevator at the floor, nearest empty or occupied passing


    }


    //Reporting actions from elevators
    public void reportMovement(int elevatorId, int floor){

    }
    public void openedDoors(int elevatorId, int floor){

    }
    public void closedDoors(int elevatorId, int floor){

    }
    public void requiresMaintenance(int elevatorId){

    }

}
